package com.alimuzaffar.ramadanalarm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public interface Constants {
  // REQUEST CODES
  int REQUEST_CHECK_SETTINGS = 101;
  int REQUEST_ONBOARDING = 102;
  int REQUEST_LOCATION = 103;
  int REQUEST_WRITE_EXTERNAL = 103;

  //EXTRAS
  String EXTRA_ALARM_INDEX = "alarm_index";
  String EXTRA_LAST_LOCATION = "last_location";

  String CONTENT_FRAGMENT = "content_fragment";
  String TIMES_FRAGMENT = "times_fragment";
  String CONFIG_FRAGMENT = "config_fragment";
  String LOCATION_FRAGMENT = "location_fragment";

  String EXTRA_PRAYER_NAME = "prayer_name";

  public static final DateFormat TIME = new SimpleDateFormat("HH:mm", Locale.getDefault());
}
