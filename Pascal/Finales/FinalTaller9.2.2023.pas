program matiBuscemi;
Type 
    alumnos=record
        nombre:string[20];
        DNI:integer;
        puntaje:real
    end;
    
    arbol=^nodoA;
    nodoA=record
        dato:alumnos;
        hi:arbol;
        hd:arbol;
    end;
    
    lista=^nodoL;
    nodoL=record
        dato:alumnos;
        sig:lista;
    end;
    
    procedure leerAlmuno(var a:alumnos);
    begin
        a.DNI:=random(100);
        if(a.DNI<>0)then
        begin
            a.puntaje:=random(100);
            //writeln('Insertar Nombre: ');
            //readln(a.nombre);
            a.nombre:='Matias Buscemi';
        end;
    end;
    
    procedure cargarArbol(var a:arbol;alu:alumnos);
    begin
        if(a=nil)then
        begin
            new(a);
            a^.dato:=alu;
            a^.hi:=nil;
            a^.hd:=nil;
        end
        else begin 
            if(a^.dato.puntaje>alu.puntaje)then
                cargarArbol(a^.hi,alu)
            else
                cargarArbol(a^.hd,alu);
        end;
    end;
    
    procedure procesarArbol(var a:arbol);
    var
        alu:alumnos;
    begin
        leerAlmuno(alu);
        while(alu.DNI<>0)do
        begin
            cargarArbol(a,alu);
            leerAlmuno(alu);
        end;
    end;
    procedure agregarAtras(var L: lista; alu: alumnos);
    var
      nue, act: lista;
    begin
      new(nue);
      nue^.dato := alu;
      nue^.sig  := nil;
      if (L = nil) then   
        L := nue
      else begin
        act := L;
        while (act^.sig <> nil) do
          act := act^.sig;
        act^.sig := nue;
      end;
    end;
    
    procedure generarLista(a:arbol;var l:lista;x:integer;y:integer);
    begin
        if(a<>nil)then
        begin
            if(a^.dato.puntaje>x)then
                generarLista(a^.hi,l,x,y);
            if(a^.dato.puntaje>x)and(a^.dato.puntaje<y)then
                agregarAtras(l,a^.dato);
            if(a^.dato.puntaje<y)then
                generarLista(a^.hd,l,x,y);
        end;
    end;
    
    procedure imprimirRegistro(a:alumnos);
    begin
        writeln('Nombre: ',a.nombre,' DNI: ',a.DNI,' puntaje: ',a.puntaje:0:2);
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
    procedure sacarMin (var puntaje:real; var minDni:integer; alu:alumnos);
    begin
        if(minDni>alu.DNI)then
        begin
            minDni:=alu.DNI;
            puntaje:=alu.puntaje;
        end;
    end;
    
    procedure puntajeDniMinimo(a:arbol;var puntaje:real;var minDni:integer);
    begin
        if(a<>nil)then begin
            puntajeDniMinimo(a^.hi,puntaje,minDni);
            sacarMin(puntaje,minDni,a^.dato);
            puntajeDniMinimo(a^.hd,puntaje,minDni);
        end;
    end;
var
a:arbol;
l:lista;
x,y,dni:integer;
puntaje:real;
begin
a:=nil;
l:=nil;
procesarArbol(a);
imprimirArbol(a);
writeln('Insertar puntaje minimo: ');
readln(x);
writeln('Insertar puntaje maxima: ');
readln(y);
generarLista(a,l,x,y);
imprimirLista(l);
dni:=1012;
puntajeDniMinimo(a,puntaje,dni);
writeln('el puntaje del alumno con dni mas chico: (',dni,') ',puntaje:0:2);
end.