program BuscemiMatias;

Type
	d=1..31;
	m=1..12;
	fech=record
		dia:d;
		mes:m;
		anio:integer;
	end;
	pedido=record
		DNI:integer;
		nombre:string[20];
		fecha:fech;
		monto:real;
	end;
	regL=record
		fecha:fech;
		monto:real;
	end;
	list=^nodoL;
	nodoL=record
		dato:regL;
		sig:list;
	end;
	regA=record
		DNI:integer;
		nombre:string[20];
		lista:list;
	end;
	arbol=^nodoA;
	nodoA=record
		dato:regA;
		hi:arbol;
		hd:arbol;
	end;
	procedure leerFecha(var f:fech);
	begin
		f.dia:=random(31)+1;
		f.mes:=random(12)+1;
		f.anio:=random(25)+2000;
	end;
	
	procedure leerPedido(var P:pedido);
	begin
		P.monto:=random(100);
		if(P.monto<>0)then begin
			leerFecha(P.fecha);
			P.DNI:=random(500)+1;
			//writeln('InsertarNombre');
			//readln(P.nombre);
			P.nombre:='Mati';
		end;
	end;
	
	procedure agregarAdelante(var l:list ; p :pedido);
	var
		nue:list;
	begin
		new(nue);
		nue^.dato.fecha:=p.fecha;
		nue^.dato.monto:=p.monto;
		nue^.sig:=l;
		l:=nue;
	end;
	
	procedure cargarArbol(var a:arbol; p:pedido);
	begin
		if(a=nil)then begin
			new(a);
			a^.dato.nombre:=p.nombre;
			a^.dato.DNI:=p.DNI;
			a^.dato.lista:=nil;
			agregarAdelante(a^.dato.lista,p);
			a^.hi:=nil;
			a^.hd:=nil;
		end
		else begin
			if(a^.dato.DNI=p.DNI)then
				agregarAdelante(a^.dato.lista,p)
			else begin
				if(a^.dato.DNI>p.DNI)then
					cargarArbol(a^.hi,p)
				else
					cargarArbol(a^.hd,p);
			end;
		end;
	end;
	
	procedure cargarEstructura(var a : arbol);
	var
		p:pedido;
	begin
		leerPedido(p);
		while(p.monto<>0)do begin
			cargarArbol(a,p);
			leerPedido(p);
		end;
	end;

	function compararFecha(f1:fech;f2:fech): boolean;
	begin
		compararFecha:=(f1.dia=f2.dia)and(f1.mes=f2.mes)and(f1.anio=f2.anio);
	end;

	procedure contarLista( l:list;var cant:integer;fecha:fech);
	begin
		while(l<>nil)do begin
			if(compararFecha(l^.dato.fecha,fecha))then
				cant:=cant+1;
			l:=l^.sig;
		end;
	end;

	procedure contarClientes(var a:arbol; var cant:integer;fecha:fech);
	begin
		if(a<>nil)then
		begin
			contarClientes(a^.hi,cant,fecha);
			contarLista(a^.dato.lista,cant,fecha);
			contarClientes(a^.hd,cant,fecha);
		end;	
	end;
	
	procedure clientesEnFecha(var a:arbol);
	var
		f:fech;
		cant:integer;
	begin
		writeln('Insertar Dia');
		readln(f.dia);
		writeln('insertar mes');
		readln(f.mes);
		writeln('insertar año');
		readln(f.anio);
		cant:=0;
		contarClientes(a,cant,f);
		writeln('La cantidad de clientes q realizaron pedidos en la fecha ingresada es de: ',cant,' clientes');
	end;
	
	procedure informe(l:list);
	var
		montoT:real;
		cantP:integer;
	begin
		montoT:=0;
		cantP:=0;
		while(l<>nil)do
		begin
			montoT:=montoT+l^.dato.monto;
			cantP:=cantP+1;
			l:=l^.sig;
		end;
		writeln('Monto Total: ',montoT:0:2,' cant Pedidos: ',cantP);
	end;
	
	procedure informeDNI(var a:arbol; dni:integer);
	begin
		if(a<>nil)then
		begin
			if(a^.dato.DNI>dni)then
				informeDNI(a^.hi,dni);
			if(a^.dato.DNI=dni)then
			begin
				writeln('Informe del cleinte con dni: ',dni);
				informe(a^.dato.lista);
			end;
			if(a^.dato.DNI<dni)then
				informeDNI(a^.hd,dni);
		end;
	end;
	
	procedure imprimirLista(l:list);
	begin
		while(l<>nil)do begin
			writeln('Fecha: ',l^.dato.fecha.dia,'/',l^.dato.fecha.mes,'/',l^.dato.fecha.anio,' Monto: ',l^.dato.monto:0:2);
			l:=l^.sig;
		end;
	end;
			
	procedure imprimirArbol(var a:arbol);
	begin
		if(a<>nil)then begin
			imprimirArbol(a^.hi);
			writeln('Nombre: ',a^.dato.nombre,' | DNI: ',a^.dato.DNI);
			imprimirLista(a^.dato.lista);
			writeln('-------------------------------------------------');
			imprimirArbol(a^.hd);
		end;
	end;		
		
var
 a:arbol;
 dni:integer;
BEGIN
randomize;
a:=nil;
cargarEstructura(a);
imprimirArbol(a);
clientesEnFecha(a);
writeln('Dni para realizar informe: ');
readln(dni);
informeDNI(a,dni);
END.
