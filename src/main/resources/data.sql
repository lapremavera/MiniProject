-- Data voor Tomaat
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, naam_latijn, oogsttijd, plant_afstand,beschrijving_plantsoort,afbeelding) values (6000, 70, 200, 'Tomaat','Solanum lycopersicum', 'juli-augustus', 50,'Moet ik nu fruit of groente zeggen tegen een tomaat? Maakt niet uit, een tomaat is vaak rood en sappig en doet het super goed in Italiaanse schotels. Denk aan pizza, spaghetti en lasagne.', 'tomaat.jpg');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(6000, 'BOS');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(6000, 'STAD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(6000, 'ZUID');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(6000, 'ZANDLEEM');
--Data voor aardappel
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, naam_latijn,oogsttijd, plant_afstand,beschrijving_plantsoort, afbeelding) values (1000, 90, 90, 'Aardappel', 'Solanum tuberosum','juli-oktober', 70,'De aardappel, in de volksmond ook \'ne patat\' genoemd, is een tot knollen verdikte stengel van een plant die oorspronkelijk uit de hoogvlakten van Peru en Bolivia komt. Nu is de aardappel in vele Europese landen een van de basisvoedingsmiddelen. Weet je dat er in België meer dan 200 aardappelrassen geteeld worden? Opgepast; aardappelloof is giftig en niet eetbaar. Gelukkig is de aardappel een heel gezonde knol, tenzij je er frietjes van bakt.','aardappel.jpeg');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(1000, 'BOS');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(1000, 'STAD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(1000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(1000, 'OOST');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(1000, 'NOORD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(1000, 'WEST');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(1000, 'ZANDLEEM');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(1000, 'LEEM');

--Data voor courgette
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort, naam_latijn, oogsttijd, plant_afstand,beschrijving_plantsoort,afbeelding) values (2000, 42, 90, 'Courgette','Cucurbita pepo var. cylindrica', 'juli-oktober', 100, 'info volgt', 'courgette.jpg');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(2000, 'BOS');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(2000, 'STAD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(2000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(2000, 'OOST');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(2000, 'WEST');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(2000, 'ZANDLEEM');
-- Data voor doperwt
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort,naam_latijn, oogsttijd, plant_afstand,beschrijving_plantsoort,afbeelding) values (3000, 42, 200, 'Doperwt','Pisum sativum', 'juni-juli', 4,'De ene erwt is de andere niet. Is hij vers en groot, dan heet deze een doperwt. Komen de groene bolletjes uit de vriezer, dan heten ze gewoon tuinerwten of groene erwten. Dan zijn er ook nog kikkererwten en de hip klinkende sugar snaps. Er zijn zoveel soorten, dat het je groen voor de ogen ziet.','doperwt.jpg');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(3000, 'BOS');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(3000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(3000, 'WEST');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(3000, 'ZAND');
-- Data voor rucola
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort,naam_latijn, oogsttijd, plant_afstand,beschrijving_plantsoort,afbeelding) values (4000, 10, 10, 'Rucola','Eruca sativa', 'maart-november', 15, 'Rucola is de Italiaanse naam voor raket. En inderdaad, zo kennen we rucola ook: als raketsla. Of roquette, of mosterdkruid, of notensla. Hoe dan ook, deze slasoort behoort tot de familie van de kool en is verwant aan mosterd en radijs. De blaadjes hebben een peperachtige, pittige smaak.Rucola is een typisch ingrediënt uit de Toscaanse keuken. Je kan het smakelijk verwerken in allerhande salades, maar smaakt ook zeer goed af in zowel koude als warme pasta’s. Gekookt of gepureerd kan je raketsla gebruiken als extra smaakmaker in soepen en sauzen. Of probeer eens een pesto met rucola in plaats van basilicum!','rucola.jpg');
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
insert into plantensoort(id, duur_tot_pluk, max_hoogte, naam_soort,naam_latijn,oogsttijd, plant_afstand,beschrijving_plantsoort,afbeelding) values (5000, 100, 75, 'Broccoli','Brassica oleracea var. italica', 'juni-oktober', 45, 'info volgt', 'Broccoli.jpg');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(5000, 'BOS');
insert into plantensoort_klimaten(plantensoort_id, klimaat) values(5000, 'STAD');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(5000, 'ZUID');
insert into plantensoort_orientaties(plantensoort_id, orientatie) values(5000, 'WEST');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(5000, 'ZANDLEEM');
insert into plantensoort_grondsoorten(plantensoort_id, grondsoort) values(5000, 'LEEM');

--insert into plaats(id, naam, klimaat, grondsoort, postcode) values(150, 'Gent', 'STAD', 'ZANDLEEM', 9000);
--insert into plaats(id, naam, klimaat, grondsoort, postcode) values(160, 'Knokke', 'STAD', 'ZAND', 8300);
--insert into plaats(id, naam, klimaat, grondsoort, postcode) values(170, 'Aywaille', 'BOS', 'LEEM', 4920);


