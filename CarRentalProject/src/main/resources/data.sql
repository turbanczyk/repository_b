/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  tomeku
 * Created: 12 lut 2022
 */


delete from Car;
insert into Car values ('123e4567-e89b-42d3-a456-556642440000', 'Mondeo', 'Ford',
    '120', '5', '500', 'manualna', 'true', '12345', 'średnie', 'Katowice');
insert into Car values ('123e4567-e89b-42d3-a456-556642440001', 'Mondeo', 'Ford',
    '150', '5', '500', 'manualna', 'true', '15341', 'średnie', 'Gliwice');
insert into Car values ('123e4567-e89b-42d3-a456-556642440002', 'Focus', 'Ford',
    '134', '5', '500', 'manualna', 'true', '15341', 'średnie', 'Gliwice');
insert into Car values ('123e4567-e89b-42d3-a456-556642440003', 'ID3', 'Volkswagen',
    '170', '5', '500', 'manualna', 'true', '15341', 'średnie', 'Gliwice');

delete from User;
insert into User values('12343212', 'user1', 'password1', 
    'Jan', 'Kowalski', 'Poland', 'Katowice', 'Orzeszkowa', 'DHEKD-3432', 
    'jan@kowalski.com', '123-456-789');
