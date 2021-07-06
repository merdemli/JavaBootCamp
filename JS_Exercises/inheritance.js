function Kisi(isim,soyİsim){
    this.isim =isim;
    this.soyİsim=soyİsim;
}

function Ogrenci (enSevdigiDers){
    this.enSevdigiDers=enSevdigiDers;
}

Ogrenci.prototype = new Kisi("İpek","Çelenk"); //bunu yazmazsak ipek kişi'si tanımlanmamış olur ve isim ve soyisim kısmı 
                                               //undefined olarak gelir

var ipek = new Ogrenci("programlama");

alert(ipek.isim  +" " + ipek.soyİsim + " 'in en sevdiği ders " +ipek.enSevdigiDers+" 'dır");