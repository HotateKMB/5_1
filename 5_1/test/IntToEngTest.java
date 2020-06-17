import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IntToEngTest {
	@Test
	 
	 public void IntToEngで0を入力したらzeroと帰ってくる() {
	  IntToEng ite = new IntToEng();
	  String expected = "zero";
	  String actual = ite.translateEng(0);
	  assertThat(actual, is(expected));
	 }

	 @Test
	 public void IntToEngで10を入力したらtenと帰ってくる() {
	  IntToEng ite = new IntToEng();
	  String expected = "ten ";
	  String actual = ite.translateEng(10);
	  assertThat(actual, is(expected));
	 }

	 @Test
	 public void IntToEngで100を入力したらonehundredと帰ってくる() {
	  IntToEng ite = new IntToEng();
	  String expected = "one hundred ";
	  String actual = ite.translateEng(100);
	  assertThat(actual, is(expected));
	 }

	 @Test
	 public void IntToEngで1000を入力したらthousandと帰ってくる() {
	  IntToEng ite = new IntToEng();
	  String expected = "one thousand ";
	  String actual = ite.translateEng(1000);
	  assertThat(actual, is(expected));
	 }

	 @Test
	 public void IntToEngで10000を入力したらzeroと帰ってくる() {
	  IntToEng ite = new IntToEng();
	  String expected = "ten thousand ";
	  String actual = ite.translateEng(10000);
	  assertThat(actual, is(expected));
	 }

	 @Test
	 public void IntToEngで100000を入力したらzeroと帰ってくる() {
	  IntToEng ite = new IntToEng();

	  String expected = "one hundred thousand ";
	  String actual = ite.translateEng(100000);
	  assertThat(actual, is(expected));
	 }

	 @Test
	 public void IntToEngで1000000を入力したらzeroと帰ってくる() {
	  IntToEng ite = new IntToEng();
	  String expected = "one million ";
	  String actual = ite.translateEng(1000000);
	  assertThat(actual, is(expected));
	 }

	 @Test
	 public void IntToEngで最大値を入力したら英語が帰ってくる() {
	  IntToEng ite = new IntToEng();
	  String expected = "two billion one hundred fourty seven million four hundred eighty three thousand six hundred fourty seven ";
	  String actual = ite.translateEng(2147483647);
	  assertThat(actual, is(expected));
	 }
	

}
