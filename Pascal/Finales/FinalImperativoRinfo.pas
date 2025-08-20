program MatiasBuscemi;
type
	id=1..5;
	objeto=0..10;
	cuadra=1..100;
	esq=record
		av:cuadra;
		ca:cuadra;
	end;
	
	robot=record
		id:id;
		cantFlores:objeto;
		cantPapeles:objeto;
		esquina:esq;
	end;
	regL=record
		cantFlores:objeto;
		cantPapeles:objeto;
		esquina:esq;
	end;
	
	regLB=record
		numAv:integer;
		cantFlores:integer;
		cantSP:integer;
	end;
	
	listB=^nodoLB;
	nodoLB=record
		dato:regLB;
		sig:listB;
	end;
	
	list=^nodoL;
	nodoL=record
		dato:regL;
		sig:list;
	end;
	
	arbol=^nodoA;
	nodoA=record
		dato:regLB;
		hi:arbol;
		hd:arbol;
	end;
	
	vec=array[1..5] of list; 
	
	procedure llegadaDeMensajes(var r:robot);
	begin
		r.id:=random(5)+1;
		r.cantFlores:=random(11);
		r.cantPapeles:=random(11);
		r.esquina.av:=random(100)+1;
		r.esquina.ca:=random(100)+1;
	end;
	
	procedure insertarOrdenadoEnVec(var l:list;r:robot);
	var
		ant,act,nue:list;
	begin
		new(nue);
		nue^.dato.cantFlores:=r.cantFlores;
		nue^.dato.cantPapeles:=r.cantPapeles;
		nue^.dato.esquina:=r.esquina;
		nue^.sig:=nil;
		act:=l;
		while(act<>nil)and(act^.dato.esquina.av<r.esquina.av)do begin
			ant:=act;
			act:=act^.sig;
		end;
		if(act=l)then l:=nue
		else	ant^.sig:=nue;
		nue^.sig:=act;
	end;
			
	procedure inicioVec(var v:vec);
	var
		i:integer;
	begin
		for i:=1 to 5 do 
			v[i]:=nil;
	end;
	procedure cargarVector(var v:vec);
	var
		r:robot;
		i:integer;
	begin
		for i:=1 to 100 do begin
			llegadaDeMensajes(r);
			insertarOrdenadoEnVec(v[r.id],r);
		end;
	end;
	procedure actualizarOaniadir(r:regL;var l:listB);
	var
		act,ant,nue:listB;
	begin
		act:=l;
		ant:=nil;
		while(act<>nil)and(act^.dato.numAv<r.esquina.av)do
		begin
			ant:=act;
			act:=act^.sig;
		end;
		
		if(act<>nil)and(act^.dato.numAv=r.esquina.av)then
		begin
			act^.dato.cantFlores:=act^.dato.cantFlores+r.cantFlores;
			if(r.cantPapeles=0)then act^.dato.cantSP:=act^.dato.cantSP+1;
		end
		else begin
			new(nue);
			nue^.dato.numAv:=r.esquina.av;
			nue^.dato.cantFlores:=r.cantFlores;
			if(r.cantPapeles=0)then nue^.dato.cantSP:=1
			else nue^.dato.cantSP:=0;
			
			nue^.sig:=act;
			if(act=l)then l:=nue
			else ant^.sig:=nue;
		end;
	end;
	procedure  generarListaOrdenada(var v:vec; var l:listB);
	var
		i	:integer;
		aux:list;
	begin
		for i:=1 to 5 do begin
			aux:=v[i];
			while(aux<>nil)do
			begin
				actualizarOaniadir(aux^.dato,l);
				aux:=aux^.sig;
			end;
		end;
	end;
	procedure cargarArbol(var a:arbol; r:regLB);
	begin
		if(a=nil)then
		begin
			new(a);
			a^.dato:=r;
			a^.hi:=nil;
			a^.hd:=nil;
		end
		else begin
			if(a^.dato.cantFlores>r.cantFlores)then
				cargarArbol(a^.hi,r)
			else
				cargarArbol(a^.hd,r);
		end;
	end;
	procedure procesarArbol(l:listB;var a:arbol);
	var
		aux:listB;
	begin
		aux:=l;
		while(aux<>nil)do
		begin
			cargarArbol(a,aux^.dato);
			aux:=aux^.sig;
		end;
	end;
	
	procedure imprimirVector(v:vec);
	var
		i:integer;
		aux:list;
	begin
		for i:=1 to 5 do
		begin
			aux:=v[i];
			while(aux<>nil)do begin
				writeln('id: ',i,' CantFlores: ',aux^.dato.cantFlores,' cantPapeles: ',aux^.dato.cantPapeles,' esquina: ',aux^.dato.esquina.av,' , ',aux^.dato.esquina.ca);
				aux:=aux^.sig;
			end;
			writeln('----------------');
		end;
	end;
	
	procedure imprimirListaB(l:listB);
	var
		aux:listB;
	begin
		aux:=l;
		while(aux<>nil)do
		begin
			writeln('numAv: ',aux^.dato.numAv,' cantFlores: ',aux^.dato.cantFlores,' cantSp: ', aux^.dato.cantSP);
			aux:=aux^.sig;
		end;
	end;
	
	procedure imprimirArbol(a:arbol);
	begin
		if(a<>nil)then
		begin
			imprimirArbol(a^.hi);
			writeln('numAv: ',a^.dato.numAv,' cantFlores: ',a^.dato.cantFlores,' cantSp: ', a^.dato.cantSP);
			imprimirArbol(a^.hd);
		end;
	end;
var
	a:arbol;
	v:vec;
	l:listB;
begin
randomize;
a:=nil;
inicioVec(v);
cargarVector(v);
writeln('Demostracion del vector: ');
imprimirVector(v);
generarListaOrdenada(v,l);
writeln('Demostracion de la lista: ');
imprimirListaB(l);
procesarArbol(l,a);
writeln('Demostracion del arbol: ');
imprimirArbol(a);
end.
