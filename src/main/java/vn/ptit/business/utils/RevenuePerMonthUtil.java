package vn.ptit.business.utils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import vn.ptit.model.order.Order;

public class RevenuePerMonthUtil {
	public static String getStringMonth() {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		return sdf.format(cal.getTime());		
	}
	
	public static String getStringMonth1() {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		return sdf.format(cal.getTime());		
	}
	
	public static String getStringMonth2() {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -2);
		return sdf.format(cal.getTime());	
	}
	
	public static String getStringMonth3() {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -3);
		return sdf.format(cal.getTime());		
	}
	
	public static String getStringMonth4() {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -4);
		return sdf.format(cal.getTime());		
	}
	
	public static String getStringMonth5() {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -5);
		return sdf.format(cal.getTime());	
	}
	
	public static double getTotalMoneyMonth(List<Order> list) {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		double total=0;
		for(int i=0;i<list.size();i++) {
			if(sdf.format(list.get(i).getDateCreate()).equalsIgnoreCase(sdf.format(cal.getTime()))) {
				total+=list.get(i).getPayment().getTotalMoney();
				
			}
		}
		return total;	
	}
	
	public static double getTotalMoneyMonth1(List<Order> list) {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		double total=0;
		for(int i=0;i<list.size();i++) {
			if(sdf.format(list.get(i).getDateCreate()).equalsIgnoreCase(sdf.format(cal.getTime()))) {
				total+=list.get(i).getPayment().getTotalMoney();
				
			}
		}
		return total;	
	}
	
	public static double getTotalMoneyMonth2(List<Order> list) {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -2);
		double total=0;
		for(int i=0;i<list.size();i++) {
			if(sdf.format(list.get(i).getDateCreate()).equalsIgnoreCase(sdf.format(cal.getTime()))) {
				total+=list.get(i).getPayment().getTotalMoney();
				
			}
		}
		return total;	
	}
	
	public static double getTotalMoneyMonth3(List<Order> list) {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -3);
		double total=0;
		for(int i=0;i<list.size();i++) {
			if(sdf.format(list.get(i).getDateCreate()).equalsIgnoreCase(sdf.format(cal.getTime()))) {
				total+=list.get(i).getPayment().getTotalMoney();
				
			}
		}
		return total;	
	}
	
	public static double getTotalMoneyMonth4(List<Order> list) {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -4);
		double total=0;
		for(int i=0;i<list.size();i++) {
			if(sdf.format(list.get(i).getDateCreate()).equalsIgnoreCase(sdf.format(cal.getTime()))) {
				total+=list.get(i).getPayment().getTotalMoney();
				
			}
		}
		return total;	
	}
	
	public static double getTotalMoneyMonth5(List<Order> list) {
		SimpleDateFormat sdf= new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -5);
		double total=0;
		for(int i=0;i<list.size();i++) {
			if(sdf.format(list.get(i).getDateCreate()).equalsIgnoreCase(sdf.format(cal.getTime()))) {
				total+=list.get(i).getPayment().getTotalMoney();
				
			}
		}
		return total;	
	}

}
