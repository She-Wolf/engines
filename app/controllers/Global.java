package controllers;

import models.*;
import play.GlobalSettings;

public class Global extends GlobalSettings {
	public void onStart(play.Application app) {
		if(Category.all().isEmpty()) {
			new Category("Бензиновые", "Бензиновый").save();
			new Category("Дизельные", "Дизельный").save();
			addEngines();
			addAccs();
			addMatchers();
		}
	}
  
	public void addEngines() {
		Engine engine;
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D1-13 / MS15L, MS15A";
		engine.power = "9.0 / 12.2";
		engine.RPM = 3200;
		engine.displacement = "0.51";
		engine.weight = 112;
		engine.dimensions = "649x476x517";
		engine.imglink = "d1-13_ms10a.jpg";
		engine.save();
		
     	engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D1-20 / MS15L, MS15A";
		engine.power = "13.8 / 18.8";
		engine.RPM = 3200;
		engine.displacement = "0.76";
		engine.weight = 130;
		engine.dimensions = "679x470x535";
		engine.imglink = "d1-20_ms10a.jpg";					
		engine.save();
		
	 	engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D1-30 / MS15L, MS15A";
		engine.power = "20.9 / 28.4";
		engine.RPM = 3200;
		engine.displacement = "1.13";
		engine.weight = 144;
		engine.dimensions = "716x482x560";
		engine.imglink = "d1-30_ms15a.jpg";					
		engine.save();
		
	 	engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D2-40 / MS15L, MS15A";
		engine.power = "29.1 / 39.6";
		engine.RPM = 3200;
		engine.displacement = "1.51";
		engine.weight = 177;
		engine.dimensions = "811x482x574";
		engine.imglink = "d2-40_ms15a.jpg";					
		engine.save();
	
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D2-55 / MS25L, MS25A, ZF25";
		engine.power = "41 / 55";
		engine.RPM = 3000;
		engine.displacement = "2.2";
		engine.weight = 243;
		engine.dimensions = "890x520x687";
		engine.imglink = "d2-55_ms25a.jpg";					
		engine.save();

		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D2-75 / MS25L, MS25A, ZF25";
		engine.power = "55 / 75";
		engine.RPM = 3000;
		engine.displacement = "2.2";
		engine.weight = 258;
		engine.dimensions = "890x520x687";
		engine.imglink = "d2-75_rev.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D1-13 / 130S";
		engine.power = "9.0 / 12.2";
		engine.RPM = 3200;
		engine.displacement = "0.51";
		engine.weight = 126;
		engine.dimensions = "735x476x517";
		engine.imglink = "d1-13_ms10a.jpg";					
		engine.save();		
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D1-20 / 130S";
		engine.power = "13.8 / 18.8";
		engine.RPM = 3200;
		engine.displacement = "0.76";
		engine.weight = 144;
		engine.dimensions = "765x470x535";
		engine.imglink = "d1-20_ms10a.jpg";					
		engine.save();	
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D1-30 / 130S";
		engine.power = "20.9 / 28.4";
		engine.RPM = 3200;
		engine.displacement = "1.13";
		engine.weight = 158;
		engine.dimensions = "727x482x560";
		engine.imglink = "d1-30_ms15a.jpg";					
		engine.save();	
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D2-40 / 130S";
		engine.power = "29.1 / 39.6";
		engine.RPM = 3200;
		engine.displacement = "1.51";
		engine.weight = 189;
		engine.dimensions = "886x482x574";
		engine.imglink = "d2-40_ms15a.jpg";					
		engine.save();	
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D2-55 / 130S";
		engine.power = "41 / 55";
		engine.RPM = 3000;
		engine.displacement = "2.2";
		engine.weight = 253;
		engine.dimensions = "930x520x687";
		engine.imglink = "d2-55_ms25a.jpg";					
		engine.save();	
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D2-75 / 150S";
		engine.power = "55 / 75";
		engine.RPM = 3000;
		engine.displacement = "2.2";
		engine.weight = 264;
		engine.dimensions = "930x520x687";
		engine.imglink = "d2-75_rev.jpg";					
		engine.save();	
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-110 / HS25AE, HS45AE";
		engine.power = "81 / 110";
		engine.RPM = 3000;
		engine.displacement = "2.4";
		engine.weight = 297/301;
		engine.dimensions = "1070x718x750";
		engine.imglink = "d3-110i-d_hs45ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-150 / HS45AE";
		engine.power = "110 / 150";
		engine.RPM = 3000;
		engine.displacement = "2.4";
		engine.weight = 301;
		engine.dimensions = "1074x718x750";
		engine.imglink = "d3-150i-d_hs45ae.jpg";					
		engine.save();
	
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-170 / HS45AE";
		engine.power = "125 / 170";
		engine.RPM = 4000;
		engine.displacement = "2.4";
		engine.weight = 301;
		engine.dimensions = "1074x718x750";
		engine.imglink = "d3-170i-d_hs45ae.jpg";					
		engine.save();	
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-200 / HS45AE";
		engine.power = "147 / 200";
		engine.RPM = 4000;
		engine.displacement = "2.4";
		engine.weight = 301;
		engine.dimensions = "1074x718x750";
		engine.imglink = "d3-200i-d_hs45ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-220 / HS45AE";
		engine.power = "162 / 220";
		engine.RPM = 4000;
		engine.displacement = "2.4";
		engine.weight = 301;
		engine.dimensions = "1074x718x750";
		engine.imglink = "d3-220i-d_hs45ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D4-180 / HS45AE, ZF63E";
		engine.power = "132 / 180";
		engine.RPM = 2800;
		engine.displacement = "3.7";
		engine.weight = 546;
		engine.dimensions = "1041x760x780";
		engine.imglink = "d4-180_hs45ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D4-225 / HS45AE, ZF63E";
		engine.power = "165 / 225";
		engine.RPM = 3500;
		engine.displacement = "3.7";
		engine.weight = 546;
		engine.dimensions = "1041x760x780";
		engine.imglink = "d4-225_hs45ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D4-260 / HS45AE, HS63AE";
		engine.power = "191 / 260";
		engine.RPM = 3500;
		engine.displacement = "3.7";
		engine.weight = 558;
		engine.dimensions = "1078x760x780";
		engine.imglink = "d4-260_hs63ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D4-300 / HS63AE";
		engine.power = "221 / 300";
		engine.RPM = 3500;
		engine.displacement = "3.7";
		engine.weight = 558;
		engine.dimensions = "1078x760x780";
		engine.imglink = "d4-300i-d_hs63ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D6-300 / HS80AE";
		engine.power = "221 / 300";
		engine.RPM = 3500;
		engine.displacement = "5.5";
		engine.weight = 677;
		engine.dimensions = "1340x760x780";
		engine.imglink = "d6-330i-d_hs80ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D6-330 / HS80AE";
		engine.power = "243 / 330";
		engine.RPM = 3500;
		engine.displacement = "5.5";
		engine.weight = 677;
		engine.dimensions = "1340x760x780";
		engine.imglink = "d6-330i-d_hs80ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D6-370 / HS80AE";
		engine.power = "272 / 370";
		engine.RPM = 3500;
		engine.displacement = "5.5";
		engine.weight = 677;
		engine.dimensions = "1340x760x780";
		engine.imglink = "d6-370_hs80ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D6-435 / HS80AE";
		engine.power = "320 / 435";
		engine.RPM = 3500;
		engine.displacement = "5.5";
		engine.weight = 699;
		engine.dimensions = "1357x760x780";
		engine.imglink = "d6-435_hs80ae.jpg";					
		engine.save();

		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D5A TA / ZF45, ZF220";
		engine.power = "89/121 - 116/160";
		engine.RPM = 1900 - 2300;
		engine.displacement = "4.76";
		engine.weight = 570;
		engine.dimensions = "1440x818x1004";
		engine.imglink = "d5a-ta.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D7A TA / ZF280";
		engine.power = "130/177 - 174/237";
		engine.RPM = 1900 - 2300;
		engine.displacement = "7.14";
		engine.weight = 760;
		engine.dimensions = "1729x909x1070";
		engine.imglink = "d7a-ta.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D7С TA / ZF280";
		engine.power = "146/199 - 195/265";
		engine.RPM = 1900 - 2300;
		engine.displacement = "7.15";
		engine.weight = 760;
		engine.dimensions = "1729x909x1070";
		engine.imglink = "d7a-ta.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D9 MH / ZF, Twin Disc";
		engine.power = "221/300 - 313/425";
		engine.RPM = 1800 - 2200;
		engine.displacement = "9.4";
		engine.weight = 1150;
		engine.dimensions = "1703x1056x1172";
		engine.imglink = "d9-mh.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D9-425 / ZF";
		engine.power = "313/425";
		engine.RPM = 2200;
		engine.displacement = "9.4";
		engine.weight = 1075;
		engine.dimensions = "1502x885x970";
		engine.imglink = "d9-425-500.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D9-500 / ZF, Twin Disc";
		engine.power = "368/500";
		engine.RPM = 2600;
		engine.displacement = "9.4";
		engine.weight = 1075;
		engine.dimensions = "1502x885x970";
		engine.imglink = "d9-425-500.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D9-575 / ZF, Twin Disc";
		engine.power = "423/575";
		engine.RPM = 2500;
		engine.displacement = "9.4";
		engine.weight = 1075;
		engine.dimensions = "1502x885x970";
		engine.imglink = "d9-500-575.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D11-510 / ZF";
		engine.power = "375/510";
		engine.RPM = 2250;
		engine.displacement = "10.84";
		engine.weight = 1145;
		engine.dimensions = "1535x945x1030";
		engine.imglink = "d11-510.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D11-625 / ZF";
		engine.power = "460/625";
		engine.RPM = 2400;
		engine.displacement = "10.84";
		engine.weight = 1145;
		engine.dimensions = "1535x945x1030";
		engine.imglink = "d11-510.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D11-670 / ZF";
		engine.power = "493/670";
		engine.RPM = 2450;
		engine.displacement = "10.84";
		engine.weight = 1145;
		engine.dimensions = "1535x945x1030";
		engine.imglink = "d11-670_zf305-2ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D11-725 / ZF";
		engine.power = "533/725";
		engine.RPM = 2500;
		engine.displacement = "10.84";
		engine.weight = 1145;
		engine.dimensions = "1535x945x1030";
		engine.imglink = "d11-670_zf305-2ae.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D13 MH / ZF, Twin Disc";
		engine.power = "294/400 - 441/600";
		engine.RPM = 1800 - 1900;
		engine.displacement = "12.78";
		engine.weight = 1520;
		engine.dimensions = "1728x1072x1220";
		engine.imglink = "d13-mh.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D13-700 / ZF, Twin Disc";
		engine.power = "515/700";
		engine.RPM = 2300;
		engine.displacement = "12.78";
		engine.weight = 1450;
		engine.dimensions = "1748x1062x1220";
		engine.imglink = "d13-700-800.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D13-800 / ZF, Twin Disc";
		engine.power = "588/800";
		engine.RPM = 2300;
		engine.displacement = "12.78";
		engine.weight = 1560;
		engine.dimensions = "1796x1089x1083";
		engine.imglink = "d13-900.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D13-900 / ZF, Twin Disc";
		engine.power = "662/900";
		engine.RPM = 2300;
		engine.displacement = "12.78";
		engine.weight = 1560;
		engine.dimensions = "1796x1089x1083";
		engine.imglink = "d13-900.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D16 MH / Twin Disc";
		engine.power = "368/501 - 552/752";
		engine.RPM = 1800 - 1900;
		engine.displacement = "16.12";
		engine.weight = 1750;
		engine.dimensions = "1817x1117x1303";
		engine.imglink = "d16-mh.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-140 / SX-A";
		engine.power = "103/140";
		engine.RPM = 4000;
		engine.displacement = "2.4";
		engine.weight = 358;
		engine.dimensions = "853x718x750";
		engine.imglink = "d3-140a-d_sx-a.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-170 / SX-A";
		engine.power = "125/170";
		engine.RPM = 4000;
		engine.displacement = "2.4";
		engine.weight = 358;
		engine.dimensions = "853x718x750";
		engine.imglink = "d3-170a-d_dps-a.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-140 / DPS-A";
		engine.power = "103/140";
		engine.RPM = 4000;
		engine.displacement = "2.4";
		engine.weight = 363;
		engine.dimensions = "853x718x750";
		engine.imglink = "d3-140a-d_sx-a.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-170 / DPS-A";
		engine.power = "125/170";
		engine.RPM = 4000;
		engine.displacement = "2.4";
		engine.weight = 363;
		engine.dimensions = "853x718x750";
		engine.imglink = "d3-170a-d_dps-a.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-200 / DPS-A";
		engine.power = "147/200";
		engine.RPM = 4000;
		engine.displacement = "2.4";
		engine.weight = 363;
		engine.dimensions = "853x718x750";
		engine.imglink = "d3-200a-d_dps-a.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D3-220 / DPS-A";
		engine.power = "162/220";
		engine.RPM = 4000;
		engine.displacement = "2.4";
		engine.weight = 363;
		engine.dimensions = "853x718x750";
		engine.imglink = "d3-220a-d_dps-a.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D4-225 / DPH";
		engine.power = "165/225";
		engine.RPM = 3500;
		engine.displacement = "3.7";
		engine.weight = 644;
		engine.dimensions = "932x760x780";
		engine.imglink = "d4-225a-d_dph.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D4-260 / DPH";
		engine.power = "191/260";
		engine.RPM = 3500;
		engine.displacement = "3.7";
		engine.weight = 660;
		engine.dimensions = "932x760x780";
		engine.imglink = "d4-260a-d_dph.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D4-300 / DPH";
		engine.power = "221/300";
		engine.RPM = 3500;
		engine.displacement = "3.7";
		engine.weight = 663;
		engine.dimensions = "932x760x780";
		engine.imglink = "d4-300a-d_dpr.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D6-300 / DPH";
		engine.power = "221/301";
		engine.RPM = 3500;
		engine.displacement = "5.5";
		engine.weight = 750;
		engine.dimensions = "1168x760x780";
		engine.imglink = "d6-330a-d_dph.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D6-330 / DPH";
		engine.power = "243/330";
		engine.RPM = 3500;
		engine.displacement = "5.5";
		engine.weight = 750;
		engine.dimensions = "1168x760x780";
		engine.imglink = "d6-330a-d_dph.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D6-370 / DPH";
		engine.power = "272/370";
		engine.RPM = 3500;
		engine.displacement = "5.5";
		engine.weight = 770;
		engine.dimensions = "1168x760x780";
		engine.imglink = "d6-370a-d_dpr.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.DIESEL();
		engine.name = "D6-400 / DPH";
		engine.power = "294/400";
		engine.RPM = 3500;
		engine.displacement = "5.5";
		engine.weight = 785;
		engine.dimensions = "1347x790x780";
		engine.imglink = "d6-400a-d_dph.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V6-225-E / SX-A";
		engine.power = "168/225";
		engine.RPM = 4800;
		engine.displacement = "4.3";
		engine.weight = 415;
		engine.dimensions = "825x758x789";
		engine.imglink = "v6-225.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V8-270-E / SX-A";
		engine.power = "201/270";
		engine.RPM = 5000;
		engine.displacement = "5.0";
		engine.weight = 452;
		engine.dimensions = "936x718x807";
		engine.imglink = "v8-270.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V8-300-E / SX-A";
		engine.power = "224/300";
		engine.RPM = 5200;
		engine.displacement = "5.7";
		engine.weight = 483;
		engine.dimensions = "936x718x807";
		engine.imglink = "v8-270.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V8-320-E / SX-A";
		engine.power = "239/320";
		engine.RPM = 5200;
		engine.displacement = "5.7";
		engine.weight = 483;
		engine.dimensions = "936x718x807";
		engine.imglink = "v8-270.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V6-225-E / DPS-B";
		engine.power = "168/225";
		engine.RPM = 4800;
		engine.displacement = "4.3";
		engine.weight = 419;
		engine.dimensions = "825x758x789";
		engine.imglink = "v6-225.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V8-270-E / DPS-B";
		engine.power = "201/270";
		engine.RPM = 5000;
		engine.displacement = "5.0";
		engine.weight = 454;
		engine.dimensions = "936x718x807";
		engine.imglink = "v8-270.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V8-300-E / DPS-B";
		engine.power = "224/300";
		engine.RPM = 5200;
		engine.displacement = "5.7";
		engine.weight = 485;
		engine.dimensions = "936x718x807";
		engine.imglink = "v8-270.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V8-320-E / DPS-B";
		engine.power = "280/375";
		engine.RPM = 5200;
		engine.displacement = "5.7";
		engine.weight = 485;
		engine.dimensions = "936x718x807";
		engine.imglink = "v8-270.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V8-350-CE / DPS-B";
		engine.power = "250/350";
		engine.RPM = 6000;
		engine.displacement = "6.0";
		engine.weight = 488;
		engine.dimensions = "973x830x815";
		engine.imglink = "v8-380.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V8-380-CE / DPS-B";
		engine.power = "283/380";
		engine.RPM = 6000;
		engine.displacement = "6.0";
		engine.weight = 488;
		engine.dimensions = "973x830x815";
		engine.imglink = "v8-380.jpg";					
		engine.save();
		
		engine = new Engine();
		engine.category = Category.PETROL();
		engine.name = "V8-430-CE / DPS-B";
		engine.power = "317/431";
		engine.RPM = 6000;
		engine.displacement = "6.0";
		engine.weight = 488;
		engine.dimensions = "973x830x815";
		engine.imglink = "v8-380.jpg";					
		engine.save();
	}
	
	public void addAccs() {
		Accessory acc;
		acc = new Accessory();
		acc.name = "Масло VDS-2";
		acc.SKU = "1141628";
		acc.URL = "http://bmb-irk.ru/index.php/vegatables-2/equipment";
		acc.save();
		
		acc = new Accessory();
		acc.name = "Фильтр масляный";
		acc.SKU = "3582732";
		acc.URL = "http://bmb-irk.ru/index.php/vegatables-2/equipment";
		acc.save();
	}
	
	public void addMatchers() {
		new Matcher(Accessory.bySKU("1141628"), Engine.byName("D1-13 / MS15L, MS15A")).save();
		new Matcher(Accessory.bySKU("3582732"), Engine.byName("D4-180 / HS45AE, ZF63E")).save();
		new Matcher(Accessory.bySKU("3582732"), Engine.byName("D4-225 / HS45AE, ZF63E")).save();
	}
}