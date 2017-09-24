-- Data voor Tomaat
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd, plant_afstand) values (6000, 9999, 200, 'Tomaat', 'juli-augustus', 50);
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(6000, 'BOS');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(6000, 'STAD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(6000, 'ZUID');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(6000, 'ZANDLEEM');
--Data voor aardappel
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd, plant_afstand,beschrijving_plantsoort) values (1000, 90, 90, 'aardappel','juli-oktober', 70,'De aardappel, in de volksmond ook \'ne patat\' genoemd, is een tot knollen verdikte stengel van een plant die oorspronkelijk uit de hoogvlakten van Peru en Bolivia komt. Nu is de aardappel in vele Europese landen een van de basisvoedingsmiddelen. Weet je dat er in België meer dan 200 aardappelrassen geteeld worden? Opgepast; aardappelloof is giftig en niet eetbaar. Gelukkig is de aardappel een heel gezonde knol, tenzij je er frietjes van bakt.');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(1000, 'BOS');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(1000, 'STAD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(1000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(1000, 'OOST');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(1000, 'NOORD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(1000, 'WEST');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(1000, 'ZANDLEEM');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(1000, 'LEEM');

--Data voor courgette
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd, plant_afstand) values (2000, 42, 90, 'Courgette', 'juli-oktober', 100);
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(2000, 'BOS');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(2000, 'STAD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(2000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(2000, 'OOST');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(2000, 'WEST');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(2000, 'ZANDLEEM');
-- Data voor doperwt
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd, plant_afstand) values (3000, 42, 200, 'Doperwt', 'juni-juli', 4);
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(3000, 'BOS');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(3000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(3000, 'WEST');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(3000, 'ZAND');
-- Data voor rucola
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd, plant_afstand) values (4000, 10, 10, 'Rucola', 'maart-november', 15);
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(4000, 'BOS');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(4000, 'STAD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(4000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(4000, 'OOST');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(4000, 'NOORD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(4000, 'WEST');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(4000, 'ZANDLEEM');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(4000, 'ZAND');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(4000, 'LEEM');
-- Data voor broccoli
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, oogsttijd, plant_afstand) values (5000, 100, 75, 'Broccoli', 'juni-oktober', 45);
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(5000, 'BOS');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(5000, 'STAD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(5000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(5000, 'WEST');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(5000, 'ZANDLEEM');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(5000, 'LEEM');

--insert into plaats(id, naam, klimaat, grondsoort, postcode) values(150, 'Gent', 'STAD', 'ZANDLEEM', 9000);
--insert into plaats(id, naam, klimaat, grondsoort, postcode) values(160, 'Knokke', 'STAD', 'ZAND', 8300);
--insert into plaats(id, naam, klimaat, grondsoort, postcode) values(170, 'Aywaille', 'BOS', 'LEEM', 4920);


