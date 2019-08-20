package org.luthfi.yamahamusicstore;

import java.util.ArrayList;

public class DataGuitar {

    public static String[] [] data = new String[][] {
            {"YAMAHA Revstar Series RS420 - Factory Blue", "Rp 8.000.000", "Yamaha merupakan sebuah perusahaan yang memproduksi macam-macam produk dari alat musik sampai kendaraan bermotor. Walaupun membuat banyak macam produk, Yamaha tidak mau memberikan konsumennya produk dengan kualitas rendah, maka dari itu Yamaha mencoba mempersembahkan kepada Anda produk-produk kualitas tinggi dengan material pilihan. Yamaha memproduksi sebuah gitar yang sangat tepat untuk kebutuhan bermusik sehari-hari Anda mulai dari latihan hingga tampil di panggung." ,"https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTTJ2mwhu9u_Hab_d4Rot-VieeiStV-Qz8YhuGltbyyYuxmxMkp"},
            {"YAMAHA Pacifica Series PAC112V - Silver", "Rp 3.400.000", "Gitar Yamaha Pacifica pertama kali diluncurkan ditahun 1990. Sebuah gitar yang sangat cocok Anda gunakan untuk latihan atau tampil di stage. Seri PAC112 merupakan seri gitar Yamaha Pacifica yang menggunakan 3 jenis pickup yang berbeda yakni 1 humbucker dan 2 single coil. Body gitar ini terbuat dari kayu alder, dan untuk necknya menggunakan maple. Gitar senar 6 ini memiliki 5 switch lever yang memungkinkan Anda memainkan berbagai genre dengan tone berbeda. " ,"https://www.bhphotovideo.com/images/images2500x2500/yamaha_rs320_vw_double_cutaway_solid_body_guitar_1386794.jpg"},
            {"YAMAHA Revstar Series RS320 - Black Steel", "Rp 6.100.000", "Yamaha merupakan sebuah perusahaan yang memproduksi macam-macam produk dari alat musik sampai kendaraan bermotor. Walaupun membuat banyak macam produk, Yamaha tidak mau memberikan konsumennya produk dengan kualitas rendah, maka dari itu Yamaha mencoba mempersembahkan kepada Anda produk-produk kualitas tinggi dengan material pilihan. Yamaha memproduksi sebuah gitar yang sangat tepat untuk kebutuhan bermusik sehari-hari Anda mulai dari latihan hingga tampil di panggung.\n" +
                    "\n" ,"https://ecs7.tokopedia.net/img/cache/700/product-1/2017/3/20/5429383/5429383_a0756edb-ed1f-401c-8891-3a3aeab97af8_2048_0.jpg"},
            {"YAMAHA Pacifica Series PAC212VFM - Tobacco Brown Sunburst", "Rp 3.700.000","Yamaha merupakan sebuah perusahaan yang sukses memproduksi tidak hanya kendaraan, namun juga alat-alat musik, mulai dari drum, gitar hingga mixer. Kini Yamaha meluncurkan sebuah seri gitar berseri Pacifica yang memiliki kualitas yang bersaing. Yamaha Pacifica seri PAC212VFM adalah salah satu gitar elektrik gitar dengan harga terbaik untuk dikelasnya. Gitar elektrik Yamaha Pacifica sudah dikenal karena tone yang hebat dan sangat enak untuk dimainkan.\n" +
                    "\n" ,"https://images.primanada.com/image/cache/products/yamaha-revstar-rs502-shop-black-800x800.jpg"},

    };

    public  static ArrayList<Guitar> getListData(){
        ArrayList<Guitar> list = new ArrayList<>();
        for (String[] adata: data){
            Guitar guitar = new Guitar();
            guitar.setBrand(adata[0]);
            guitar.setPrice(adata[1]);
            guitar.setDeskripsi(adata[2]);
            guitar.setPhoto(adata[3]);
            list.add(guitar);
        }
        return  list;
    }


}
