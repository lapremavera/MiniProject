insert into klimaat(id, naam, regen_hoeveelheid) values(10, 'Bosklimaat', 150);
insert into klimaat(id, naam, regen_hoeveelheid) values(20, 'Stadsklimaat', 165);

insert into grondsoort(id, naam) values(1600, 'Leem');
insert into grondsoort(id, naam) values(1700, 'Klei');

insert into planten_soort(id, duur_tot_pluk, max_hoogte, naam_soort) values (1000, 90, 90, 'aardappel');
insert into planten_soort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd) values (2000, 100, 75, 'broccoli', 'juni-oktober');
insert into planten_soort(id, duur_tot_pluk, max_hoogte, naam_soort) values (3000, 42, 90, 'courgette' );
insert into planten_soort(id, duur_tot_pluk, max_hoogte, naam_soort) values (4000, 42, 170 , 'doperwt');
insert into planten_soort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd) values (5000, 10, 10, 'rucola', 'maart-november');



-- Data voor Tomaat
insert into planten_soort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd) values (6000, 9999, 200, 'Tomaat', 'nooit, want er komen toch geen tomaten aan je plant');
insert into planten_soort_grondsoorten(planten_soort_id, grondsoorten_id) values(6000, 1600);
insert into planten_soort_klimaten(planten_soort_id, klimaten_id) values(6000, 10);
insert into planten_soort_klimaten(planten_soort_id, klimaten_id) values(6000, 20);
insert into planten_soort_orientaties(planten_soort_id, orientatie) values(6000, 'ZUID');
insert into planten_soort_orientaties(planten_soort_id, orientatie) values(6000, 'NOORD');




insert into gemeente(id, naam, grondsoort_id, klimaat_id) values(150, 'Gent', 1600, 20);