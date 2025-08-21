program MatiasBuscemi;
type
    alumno=record
        nombre:string[20];
        legajo:integer;
        autoevaluaciones:integer;
    end;
    
    arbol=^nodoA;
    nodoA=record
        dato:alumno;
        hi:arbol;
        hd:arbol;
    end;
    
    list=^nodoL;
    nodoL=record
        dato:alumno;
        sig:list;
    end;
    
    procedure leerAlumno(var a:alumno);
    begin
        a.legajo:=random(100);
        if(a.legajo<>0)then
        begin
            a.autoevaluaciones:=0;
            writeln('nombre del alumno: ');
            readln(a.nombre);
        end;
    end;
    
    procedure cargarArbol(var a:arbol;alu:alumno);
    begin
        if(a=nil)then
        begin
            new(a);
            a^.dato:=alu;
            a^.hi:=nil;
            a^.hd:=nil;
        end
        else begin
            if(a^.dato.legajo>alu.legajo)then
                cargarArbol(a^.hi,alu)
            else
                cargarArbol(a^.hd,alu);
        end;
    end;
    
    procedure procesarAlumnos(var a:arbol);
    var
        alu:alumno;
    begin
        leerAlumno(alu);
        while(alu.legajo<>0)do begin
            cargarArbol(a,alu);
            leerAlumno(alu);
        end;
    end;
    
    procedure aumentarUno(var a:arbol;num:integer);
    begin
        if(a<>nil)then begin
            if(a^.dato.legajo>num)then 
                aumentarUno(a^.hi,num);
            if(a^.dato.legajo=num)then
                a^.dato.autoevaluaciones:=a^.dato.autoevaluaciones+1;
            if(a^.dato.legajo<num)then
                aumentarUno(a^.hd,num);
        end;
    end;
    
    
    procedure insertarOrdenado (var l:list; a:alumno);
    var
        ant,act,nue:list;
    begin
        new(nue);
        nue^.dato:=a;
        nue^.sig:=nil;
        act:=l;
        ant:=nil;
        while(act<>nil)and(act^.dato.nombre<a.nombre)do begin
            ant:=act;
            act:=act^.sig;
        end;
        if(act=l)then l:=nue
        else    ant^.sig:=nue;
        nue^.sig:=act;
    end;
    
    procedure generarLista( a:arbol;var l:list );
    begin
        if(a<>nil)then
        begin
            if(a^.dato.autoevaluaciones>=3)then 
                insertarOrdenado(l,a^.dato);
            generarLista(a^.hi,l);
            generarLista(a^.hd,l);
        end;
    end;
    
    procedure imprimirAlumno(a:alumno);
    begin
        writeln('Nombre: ',a.nombre,' Legajo: ',a.legajo,' Cantidad de autoevaluaciones aprobadas: ',a.autoevaluaciones);
    end;
    
    procedure imprimirLista(l:list);
    begin
        while(l<>nil)do begin
            imprimirAlumno(l^.dato);
            l:=l^.sig;
        end;    
    end;
    procedure imprimirArbol( a:arbol);
    begin
        if(a<>nil)then begin
            imprimirArbol(a^.hi);
            imprimirAlumno(a^.dato);
            imprimirArbol(a^.hd);
        end;
    end;
    
var
    arb:arbol;
    lista:list;
    legajo:integer;
begin
    arb:=nil;
    lista:=nil;
    procesarAlumnos(arb);
    imprimirArbol(arb);
    // a modo de prueba para poder crear la lista uso este while.
    writeln('insertar legajo del alumno q aprobo la autoevaluacion: ');
    readln(legajo);
    while(legajo<>0)do begin
        aumentarUno(arb,legajo);
        writeln('insertar legajo del alumno q aprobo la autoevaluacion: ');
        readln(legajo);
    end;
    generarLista(arb,lista);
    imprimirArbol(arb);
    writeln('Lista: ');
    imprimirLista(lista);
end.