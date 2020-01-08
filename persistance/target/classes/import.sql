INSERT INTO AUTHOR (ID_AUTHOR, FIRST_NAME, LAST_NAME, BIRTH_PLACE) VALUES ('1', 'Czeslaw', 'Milosz', 'Warszawa');
INSERT INTO AUTHOR (ID_AUTHOR, FIRST_NAME, LAST_NAME, BIRTH_PLACE) VALUES ('2','Witold', 'Gombrowicz', 'Krakow');
INSERT INTO AUTHOR (ID_AUTHOR, FIRST_NAME, LAST_NAME, BIRTH_PLACE) VALUES ('3','Adam', 'Mickiewicz', 'Warszawa');
INSERT INTO AUTHOR (ID_AUTHOR, FIRST_NAME, LAST_NAME, BIRTH_PLACE) VALUES ('4','Henryk', 'Sienkiewicz', 'Krakow');

INSERT INTO BORROWER_DETAILS (ID_BORROWER_DETAILS, ADDRESS, PHONE, EMAIL) VALUES ('1','Prosta 2, Warszawa', '234567895', 'andrzej.kowal@gmail.com');
INSERT INTO BORROWER_DETAILS (ID_BORROWER_DETAILS, ADDRESS, PHONE, EMAIL) VALUES ('2', 'Slowackiego 5, Krakow', '234567895', 'julia.m123@op.pl');

INSERT INTO BOOK(ID_BOOK, CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, SUMMARY, TITLE, AUTHOR_ID) VALUES ('1','FANTASY', FALSE,'2364576896573', 345, '1994-01-01', 'A brilliant, semiautobiographical satirical novel from one of the foremost figures in twentieth-century Polish literature.', 'Trans-Atlantyk', 1);
INSERT INTO BOOK(ID_BOOK, CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, SUMMARY, TITLE, AUTHOR_ID) VALUES ('2','HISTORY', FALSE,'2864576896573', 245, '1994-01-01', 'The article is an attempt at accounting for the apparent differences in meaning between the Polish word umysł and its English dictionary equivalent.', 'Zniewolony Umysl', 1);
INSERT INTO BOOK(ID_BOOK, CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, SUMMARY, TITLE, AUTHOR_ID) VALUES ('3','HISTORY', FALSE,'3164576896522', 567, '1971-06-01', 'In this bitterly funny novel by the renowned Polish author Witold Gombrowicz. a writer finds himself tossed into a chaotic world of schoolboys by a diabolical professor who wishes to reduce him to childishness. Originally published in Poland in 1937.', 'Ferdydurke', 2);
INSERT INTO BOOK(ID_BOOK, CATEGORY, BORROW, ISBN, PAGES, RELEASE_DATE, SUMMARY, TITLE, AUTHOR_ID) VALUES ('4','HORROR', FALSE,'4464576896599', 477, '1990-01-01', 'The article deals with the novel The Issa Valley, written by the Nobel laureate in literature Czesław Miłosz, and its eponymous film adaptation by film director Tadeusz Konwicki. Both authors were born in the region of today’s Lithuania, which, with its intact natural environment and ancient folk beliefs, left a strong mark on their childhoods.', 'Dolina Issy', 2);

INSERT INTO BORROWER (ID_BORROWER, FIRST_NAME, LAST_NAME, ID_BORROWER_DETAILS) VALUES ('1','Andrzej', 'Kowalczyk', 1);
INSERT INTO BORROWER (ID_BORROWER, FIRST_NAME, LAST_NAME, ID_BORROWER_DETAILS) VALUES ('2', 'Julia', 'Malinowska', 2);
INSERT INTO BORROWER (ID_BORROWER, FIRST_NAME, LAST_NAME, ID_BORROWER_DETAILS) VALUES ('3','Stefan', 'Was', null);
INSERT INTO BORROWER (ID_BORROWER, FIRST_NAME, LAST_NAME, ID_BORROWER_DETAILS) VALUES ('4','Maria', 'Raczkowska', null);



