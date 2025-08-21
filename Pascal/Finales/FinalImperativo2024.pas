program finalTallerProgramacion;
type
    lvl=1..5;
    lugarProblema=1..50;
    llamada=record
        cantAfectados:integer;
        nivel:lvl;
        sectorProblema:lugarProblema;
    end;
    regL=record
        cantAfectados:integer;
        sectorProblema:lugarProblema;
    end;
    list=^nodoL;
    nodoL=record
        dato:regL;
        sig:list;
    end;
    
    arbol=^nodoA;
    nodoA=record
        dato:regL;
        hi:arbol;
        hd:arbol;
    end;
    
    vec=array[1..5] of list;
    contador=array[1..50] of integer;
    procedure registrarLlamada(var l:llamada);
    begin
        l.cantAfectados:=random(100)+1;
        l.nivel:=random(5)+1;
        l.sectorProblema:=random(50)+1;
    end;
    
    procedure insertarOrdenado(var l:list; reg: llamada);
    var
        ant,act,nue:list;
    begin
        new(nue);
        nue^.dato.cantAfectados:=reg.cantAfectados;
        nue^.dato.sectorProblema:=reg.sectorProblema;
        nue^.sig:=nil;
        ant:=nil;
        act:=l;
        while(act<>nil)and(act^.dato.sectorProblema<reg.sectorProblema)do begin
            ant:=act;
            act:=act^.sig;
        end;
        if(act=l)then l:=nue
        else ant^.sig:=nue;
        nue^.sig:=act;
    end;
    
    procedure iniciarVector(var v:vec);
    var
        i:integer;
    begin
        for i := 1 to 5 do  
            v[i]:=nil;
    end;
    
    procedure simularLlamadas (var v:vec);
    var
        l:llamada;
        i:integer;
    begin
        for i:= 1 to 100 do begin
            registrarLlamada(l);
            insertarOrdenado(v[l.nivel],l);
        end;
    end;
    
    procedure cargarArbol(var a : arbol; reg: regL);
    begin
        if(a=nil)then
        begin
            new(a);
            a^.dato:=reg;
            a^.hi:=nil;
            a^.hd:=nil;
        end
        else begin
            if(a^.dato.cantAfectados>reg.cantAfectados)then
                cargarArbol(a^.hi,reg)
            else
                cargarArbol(a^.hd,reg);
        end;
    end;
    
    procedure procesarArbol( v: vec; var a:arbol;N:integer);
    var
        aux:list;
    begin
        aux:=v[N];
        while(aux<>nil)do
        begin
            cargarArbol(a,aux^.dato);
            aux:=aux^.sig;    
        end;
    end;
    
    procedure iniciarVectorContador(var v : contador);
    var
        I:integer;
    begin
        for I:=1 to 50 do begin
            v[I]:=0;
        end;
    end;
    
    procedure cargarVecContador(var v:contador; a:arbol );
    begin
        if(a<>nil)then
        begin
            cargarVecContador(v,a^.hi);
            v[a^.dato.sectorProblema]:=v[a^.dato.sectorProblema]+1;
            cargarVecContador(v,a^.hd);
        end;
    end;
    
    procedure sacarMax(var imax:integer; v:contador);
    var 
        max,i:integer;
    begin
        max:=-1;
        for i:= 1 to 50 do begin
            if(v[i]>max)then
            begin
                imax:=i;
                max:=v[i];
            end;
        end;
    end;
    procedure imprimirReg(r:regL);
    begin
        writeln('Cantidad de afectados: ',r.cantAfectados,' sector donde se produjo el problema: ',r.sectorProblema);
    end;
    
    
    procedure imprimirLista(l:list);
    begin
        while(l<>nil)do begin
            imprimirReg(l^.dato);
            l:=l^.sig;
        end;
    end;
    
    procedure imprimirArbol(a:arbol);
    begin
        if(a<>nil)then
        begin
            imprimirArbol(a^.hi);
            imprimirReg(a^.dato);
            imprimirArbol(a^.hd);
        end;
    end;
    
    procedure imprimirVector(v:vec);
    var 
        i:integer;
    begin
        writeln('Imprimiendo Vector: ');
        for i:=1 to 5 do begin
            writeln('Problemas del nivel de importancia: ',i);
            imprimirLista(v[i]);
        end;
        writeln('----------------------------------------------------------------');
    end;
var 
    a:arbol;
    vector:vec;
    vecContador:contador;
    N:integer;
    max:integer;
begin
    randomize;
    max:=-1;
    a:=nil;
    iniciarVectorContador(vecContador);
    iniciarVector(vector);
    simularLlamadas(vector);
    imprimirVector(vector);
    writeln('Insertar el nivel a partir del cual se va a generar la nueva estructura (1-5): ');
    readln(N);
    procesarArbol(vector,a,N);
    imprimirArbol(a);
    cargarVecContador(vecContador,a);
    sacarMax(max,vecContador);
    writeln('El sector con mayor cantidad de llamados del sector: ',N,' fue el sector numero: ',max);
end.