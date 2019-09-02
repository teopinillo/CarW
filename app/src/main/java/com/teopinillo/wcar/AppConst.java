package com.teopinillo.wcar;

import java.util.Calendar;

class AppConst {
    public static final Integer CURRENT_YEAR;
    public static Integer START_YEAR = 1930;

    static {
        CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
    }
}
