insert into klimaat(id, naam, regen_hoeveelheid) values(10, 'Bosklimaat', 150);
insert into klimaat(id, naam, regen_hoeveelheid) values(20, 'Stadsklimaat', 165);

insert into grondsoort(id, naam) values(1600, 'Leem');
insert into grondsoort(id, naam) values(1700, 'Klei');
insert into grondsoort(id, naam) values(1800, 'Zand');

insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort,plant_afstand) values (1000, 90, 90, 'aardappel',70);
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd, plant_afstand) values (2000, 100, 75, 'broccoli', 'juni-oktober', 45);
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, plant_afstand) values (3000, 42, 90, 'courgette',100);
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, plant_afstand) values (4000, 42, 170 , 'doperwt',4);
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd, plant_afstand) values (5000, 10, 10, 'rucola', 'maart-november',15);



-- Data voor Tomaat
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd, plant_afstand) values (6000, 9999, 200, 'Tomaat', 'juli-augustus', 50);
insert into plantensoort_grondsoorten(plantensoort_id, grondsoorten_id) values(6000, 1600);
insert into plantensoort_klimaten(plantensoort_id, klimaten_id) values(6000, 10);
insert into plantensoort_klimaten(plantensoort_id, klimaten_id) values(6000, 20);
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(6000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(6000, 'NOORD');




insert into plaats(id, naam, grondsoort_id, klimaat_id) values(150, 'Gent', 1600, 20);
insert into plaats(id, naam, grondsoort_id, klimaat_id) values(160, 'Knokke', 1800, 20);
insert into plaats(id, naam, grondsoort_id, klimaat_id) values(170, 'Aywaille', 1700, 10);
