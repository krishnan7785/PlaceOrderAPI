package com.salesforce.placeorder.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import com.salesforce.placeorder.helper.LogHelper;

public class DateUtil {
	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
	public static final String UI_DATE_FORMAT = "MM/dd/yyyy";
	public static final DateTimeFormatter ISO_8601_FORMATTER = new DateTimeFormatterBuilder()
			.parseCaseInsensitive().appendPattern("yyyy-MM-dd")
			.appendLiteral('T').appendPattern("HH:mm:ss[.SSS]")
			.appendOffset("+HH:MM", "Z").toFormatter();

	public static String formatDateTime(ZonedDateTime dateTime)
			throws DateTimeException {
		return ISO_8601_FORMATTER.format(dateTime);
	}

	public static ZonedDateTime parseDateTime(String dateTimeStr)
			throws DateTimeParseException {
		return ZonedDateTime.parse(dateTimeStr, ISO_8601_FORMATTER);
	}

	public static Date getApiFormattedDate(String date) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		try {
			return sdf1.parse(date);
		} catch (ParseException e) {
			LogHelper.logger.error(e.getMessage(), e.getCause());
		}
		return null;
	}

	public static final TimeZone DEFAULT_TIME_ZONE = TimeZone
			.getTimeZone("America/Los_Angeles");

	public static Date addDaysFromToday(int daysToAdd) {
		Calendar c = Calendar.getInstance(DEFAULT_TIME_ZONE);
		c.add(Calendar.DAY_OF_YEAR, daysToAdd);
		return c.getTime();
	}

	public static String convertApiFormat(String date) {
		SimpleDateFormat sdf1 = new SimpleDateFormat(UI_DATE_FORMAT);
		SimpleDateFormat sdf2 = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		sdf1.setLenient(false);
		try {
			return sdf2.format(sdf1.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage(), e.getCause());
		}
		return null;
	}

}
