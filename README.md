1. NIM  : 1901117
   Nama : Irfan Sholeh
2. NIM  : 1901321
   Nama : Rival Swandy Irawan
   
Class GameEngine
- Set ruangan dengan class ruangan ber NPC
- Set objPlayer dengan class turunan Hero
- Inisialisasi objPlayer dengan nama Irfan Sholeh dan kesehatannya 100

Class GameInfo
- Mengubah class ruangan dengan menjadi child ruangan ber NPC

Class Hero
- Menambahkan class hero untuk menjadi parent dari player dan NPC yang mana memiliki attribut :
  - kesehatan
  - nama
  - ArrItem (polimorphisme Item)
  - objGameInfo
- memiliki method printItem, hapusItem dan pilihanaksi

Class NPC
- Class child dari Hero yang mana npc ini memiliki attribut iskenal dan arrAksi (untuk pengenalan dan menanyakan kunci)
- memiliki method prosesAksi yang mana didalamnya adalah pengkondisian saat aksi terhadap NPC apakah berkenalan atau menanyakan kunci dengan ada syarat harus berkenalan terlebih dahulu
- terdapat fungsi setObjGameInfo dengan override yang mana terdapat tambahan objBarang di set gameinfonya sama dengan NPC nya

Class Player
- Class child dari parent Hero yang membedakannya adalah atribut ruanganAktif dan juga punya objCincin sebagai barang default kepunyaan player
- Memiliki class constructor untuk set item cincin ke arrItem dari parentnya

Class Item
- Class parent dari class itemBarang dan ItemPintu
- Memiliki method printAksi dimana didalamnya ada deskripsi item dan juga buang atau ambil itemnya
- memiliki method pendukung untuk buang dan ambil

Class ItemBarang
- Class child dari Item yang memiliki constructor untuk set nama itemnya
- memiliki fungsi override getAksi yang mana mereturn untuk deskripsi dan juga kondisi jika di dalam ruangan maka akan bisa diambil dan jika di item player maka bisa dibuang

Class ItemPintu
- Class child dari item yang memiliki constructor set nama item (berbedanya dengan itemBarang adalah untuk fungsi proses aksi didalamnya ada pengkondisian untuk pintu)
- Method override prosesAksi yang didalamnya mengeluarkan deksripsi pintu atau membuka pintu dengan pengecekan item kunci

Class Ruangan
- Menjadi class parent untuk class ruangan
- perbedaannya untuk class parent ini tidak memiliki attribut NPC
- Dalam pilihanAksi hanya aksi untuk item saja (attribut item disini sudah menggunakan fitur polimorpisme) dan untuk aksi NPC di hapus

Class RuanganDenganNPC
- Class child dari parent Ruangan
- perbedaanya memiliki objek pintu, roti untuk objek bantuan dan juga memiliki objek NPC
- memiliki constructor untuk inisialisasi roti dan pintu lalu dimasukan ke attribut parent arrItem (polimorpisme)
- memiliki fungsi override setObjGameInfo untuk set semua item yang dimiliki NPC bergameinfo yang sama
- fungsi override pilihanAksi untuk menambahkan aksi untuk npc berkenalan dan meminta kunci

Terima Kasih
