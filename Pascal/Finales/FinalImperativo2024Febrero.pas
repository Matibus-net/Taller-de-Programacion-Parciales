program BuscemiMatias;
type
    alumno=record
        nombre:string[20];
        DNI:integer;
        tiempo:real;
    end;
    
    arbol=^nodoA;
    nodoA=record
        dato:alumno;
        hi:arbol;
        hd:arbol;
    end;
    
    lista=^nodoL;
    nodoL=record
        dato:alumno;
        sig:lista;
    end;
    
    procedure leerAlumno (var a:alumno);
    begin
        a.DNI:=random(300);
        if(a.DNI<>0)then
        begin
            writeln('Nombre del alumno: ');
            readln(a.nombre);
            a.tiempo:=random(10)+1.3;
        end;
    end;
    procedure cargarArbol(var a:arbol; alu:alumno);
    begin
        if(a=nil)then
        begin
            new(a);
            a^.dato:=alu;
            a^.hi:=nil;
            a^.hd:=nil;
        end
        else begin
            if(a^.dato.DNI>alu.DNI)then 
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
        while(alu.DNI<>0)do
        begin
            cargarArbol(a,alu);
            leerAlumno(alu);
        end;
    end;
    
    procedure insertarOrdenado(var l:lista;alu:alumno);
    var
        ant,act,nue:lista;
    begin
        new(nue);
        nue^.dato:=alu;
        nue^.sig:=nil;
        ant:=nil;
        act:=l;
        while(act<>nil)and(act^.dato.tiempo<alu.tiempo)do 
        begin
            ant:=act;
            act:=act^.sig;
        end;
        
        if(act=l)then l:=nue
        else    ant^.sig:=nue;
        nue^.sig:=act;
    end;
    
    procedure generarLista( a:arbol;var l:lista; x:integer;y:integer);
    begin
        if(a<>nil)then 
        begin
                generarLista(a^.hi,l,x,y);
            if(a^.dato.tiempo>x)and(a^.dato.tiempo<y)then
                insertarOrdenado(l,a^.dato);
                generarLista(a^.hd,l,x,y);
        end;
    end;
    procedure sacarMin(var min:real;var nombre:string;var DNI:integer;a:alumno);
    begin
        if(a.tiempo<min)then
        begin
            min:=a.tiempo;
            nombre:=a.nombre;
            DNI:=a.DNI;
        end;
    end;
    
    procedure sacarMinArbol(a:arbol;var min:real;var nombre:string;var DNI:integer);
    begin
        if(a<>nil)then
        begin
            sacarMinArbol(a^.hi,min,nombre,DNI);
            sacarMin(min,nombre,DNI,a^.dato);
            sacarMinArbol(a^.hd,min,nombre,DNI);
        end;
    end;

    procedure alumnoMaRapido(a:arbol);
    var 
        nombre:string[20];
        min:real;
        DNI:integer;
    begin
        min:=11.00;
        sacarMinArbol(a,min,nombre,DNI);
        writeln('El alumno mas rapido fue: ',nombre,' DNI: ',DNI);
    end;
    
    procedure imprimirRegistro(a:alumno);
    begin
        writeln('Nombre: ',a.nombre,' DNI: ',a.DNI,' Tiempo',a.tiempo:0:2);
    end;
    
    procedure imprimirLista(l:lista);
    begin
        while(l<>nil)do 
        begin
            imprimirRegistro(l^.dato);
            l:=l^.sig;
        end;
    end;
    procedure imprimirArbol(a:arbol);
    begin
        if(a<>nil)then
        begin
            imprimirArbol(a^.hi);
            imprimirRegistro(a^.dato);
            imprimirArbol(a^.hd);
        end;
    end;

var
    arb:arbol;
    list:lista;
    y,x:integer;
    
begin
randomize;
arb:=nil;
list:=nil;
procesarAlumnos(arb);
imprimirArbol(arb);
writeln('Insertar el minimo tiempo tardado para pertenecer a la lista: ');
readln(x);
writeln('Insertar el maximo tiempo tardado para pertenecer a la lista: (mayor al anterior)');
readln(y);
generarLista(arb,list,x,y);
imprimirLista(list);
alumnoMaRapido(arb);
end.