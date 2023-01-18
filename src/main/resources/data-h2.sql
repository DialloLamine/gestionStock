

MERGE INTO TUSER VALUES
('admin','$2a$10$BR98DmjHecYVdqtNz3UGcuyFop/ed0KfxOEAp1bdVXh8eF2iAfOz.',0 ),
('sc1','$2a$10$WvAj8iSJyIxDQWHysC4o6usLkzKW5bi9GThqYH2X/w/vVAm18nWcq',1),
('sc2','$2a$10$ZZ4U5deuZBQqp/BNmKrG1e6OqiRwmaAfu.aaQfgBI9ehImH8AYZKC',1),
('sc3','$2a$10$L52dX/XSaT0P6zHffxhoDeut7chOQ8CquX5OKKJmXF2u9Yyb0IO.m',1),
('mag1','$2a$10$N8pzEKs1350SPT1vpomUo.zMEV1IR/LjXgOrBJ.QaeddZtKLVxR4q',2),
('mag2','$2a$10$.Tlzs3a.2PEGK1gckhgaJuz4SWW2J1lWBf.4E3rOleziGDpExtp1W',2),
('mag3','$2a$10$eeilUxVqPB8dXMsnzxiIp.OlOyD1isPtICWaRRL5VFofqcWcSURk2',2),
('for1','$2a$10$N8pzEKs1350SPT1vpomUo.zMEV1IR/LjXgOrBJ.QaeddZtKLVxR4q',3),
('for2','$2a$10$.Tlzs3a.2PEGK1gckhgaJuz4SWW2J1lWBf.4E3rOleziGDpExtp1W',3),
('for3','$2a$10$eeilUxVqPB8dXMsnzxiIp.OlOyD1isPtICWaRRL5VFofqcWcSURk2',3),
('dr1','$2a$10$N8pzEKs1350SPT1vpomUo.zMEV1IR/LjXgOrBJ.QaeddZtKLVxR4q',4),
('dr2','$2a$10$.Tlzs3a.2PEGK1gckhgaJuz4SWW2J1lWBf.4E3rOleziGDpExtp1W',4),
('dr3','$2a$10$eeilUxVqPB8dXMsnzxiIp.OlOyD1isPtICWaRRL5VFofqcWcSURk2',4),
('cus1','$2a$10$N8pzEKs1350SPT1vpomUo.zMEV1IR/LjXgOrBJ.QaeddZtKLVxR4q',5),
('cus2','$2a$10$.Tlzs3a.2PEGK1gckhgaJuz4SWW2J1lWBf.4E3rOleziGDpExtp1W',5),
('cus3','$2a$10$eeilUxVqPB8dXMsnzxiIp.OlOyD1isPtICWaRRL5VFofqcWcSURk2',5),
('cli1','$2a$10$N8pzEKs1350SPT1vpomUo.zMEV1IR/LjXgOrBJ.QaeddZtKLVxR4q',6),
('cli2','$2a$10$.Tlzs3a.2PEGK1gckhgaJuz4SWW2J1lWBf.4E3rOleziGDpExtp1W',6),
('cli3','$2a$10$eeilUxVqPB8dXMsnzxiIp.OlOyD1isPtICWaRRL5VFofqcWcSURk2',6),
('Sect','$2a$10$eeilUxVqPB8dXMsnzxiIp.OlOyD1isPtICWaRRL5VFofqcWcSURk2',7);



MERGE INTO TSERVICE_CUSTUM(ID,NOM,PRENOM,EMAIL,FKUSER) VALUES
(1,'SERV_CUST_ONE','One','sc1@onecode.com','sc1'),
(2,'SERV__CUST_TWO','Two','sc2@onecode.com','sc2'),
(3,'SERV_CUST_THREE','Three','sc3@onecode.com','sc3');


