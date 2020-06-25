use master
go
create database DB_QLMH
go
use DB_QLMH
go
create table SinhVien
(
	MSSV char(8),
	HoTen nvarchar(50),
	GioiTinh char(3),
	CMND char(15),
	MaLop char(10),
	primary key(MSSV)
)
go
create table Lop
(
	MaLop char(10),
	primary key(MaLop)
)
go
create table TKB
(
	MaMon char(10),
	TenMon nvarchar(50),
	PhongHoc char(10),
	primary key(MaMon)
)

go
create table KhoaHoc
(
	MaLop char(10),
	MaMon char(10),
	MSSV char(8),
	primary key(MaLop, MaMon)
)
go
create table BangDiem
(
	MaLop char(10),
	MaMon char(10),
	MSSV char(8),
	DiemGK dec(10,1),
	DiemCK dec(10,1),
	DiemKhac dec(10,1),
	DiemTong dec(10,1),
	primary key(MaLop, MaMon, MSSV)
)
go
create table TaiKhoan
(
	Username char(8),
	Password char(50),
	primary key(Username)
)
go
alter table SinhVien add constraint fk_SVthuocLop foreign key(MaLop) references Lop(MaLop)
go
alter table TaiKhoan add constraint fk_user foreign key(Username) references SinhVien(MSSV)
go
alter table KhoaHoc add constraint fk_KhoaHoc_Lop foreign key(MaLop) references Lop(MaLop)
go
alter table KhoaHoc add constraint fk_KhoaHoc_TKB foreign key(MaMon) references TKB(MaMon)
go
alter table KhoaHoc add constraint fk_KhoaHoc_SV foreign key(MSSV) references SinhVien(MSSV)
go
alter table BangDiem add constraint fk_BangDiem_Lop foreign key(MaLop) references Lop(MaLop)
go
alter table BangDiem add constraint fk_BangDiem_TKB foreign key(MaMon) references TKB(MaMon)
go
alter table BangDiem add constraint fk_BangDiem_SV foreign key(MSSV) references SinhVien(MSSV)