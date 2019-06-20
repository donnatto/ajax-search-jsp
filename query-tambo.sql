	create database tambo
	use tambo
	go
	create table producto(
		id int identity(1,1) primary key,
		nombre varchar(30) not null,
		descripcion varchar(30) not null,
		precio money not null,
		stock int not null
		)
	go
	insert into producto values
		('Galleta Morocha', 'Galletitas', 2.0, 100),
		('COca Cola', 'Gasesosa para la limpieza', 5, 100),
		('Inka Cola', 'Gaseosa gringa', 5, 100)
	go
	create procedure buscar
	@nombre varchar(30)
	as
	begin select * from producto where nombre like '%'+@nombre+'%'
	end
	go

	exec buscar 'k'