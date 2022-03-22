package com.risma.provinsiindonesia;

import java.util.ArrayList;

public class ProvinsiData {
    private static String [] provinsiName = {
            "University Indonesia",
            "University Brawijaya",
            "University Udayana",
            "University Gadjah Mada",
            "University Telkom",
            "University Binus",
            "University Surabaya",
            "University Jember",
    };
    private static String [] provinsiDetail = {
            "University Indonesia di Jakarta",
            "University Brawijaya di Malang",
            "University Udayana di Bali",
            "University Gadjah Mada di Yogyakarta",
            "University Telkom di Bandung",
            "University Binus di Surabaya",
            "University Surabaya di Surabaya",
            "University Jember di Jember",
    };

    private static int[] provinsiImage = {
            R.drawable.ui,
            R.drawable.brawijaya,
            R.drawable.unud,
            R.drawable.ugm,
            R.drawable.telkom,
            R.drawable.binus,
            R.drawable.unsub,
            R.drawable.jember,
    };

    static ArrayList<Provinsi> getListData(){
        ArrayList<Provinsi> list = new ArrayList<>();
        for (int position = 0; position <provinsiImage.length; position++){
            Provinsi provinsi = new Provinsi();
            provinsi.setName(provinsiName[position]);
            provinsi.setDetail(provinsiDetail[position]);
            provinsi.setPhoto(provinsiImage[position]);
            list.add(provinsi);
        }
        return list;
    }
}
