package ԭ��ģʽ;

public class Main
{
	public static void main(String[] args)
	{
		Resume a = new Resume("����");
		a.setPersonalInfo("��", "29");
		a.setWorkExperience("1998-2000", "XX��˾");

		Resume b = a.clone();
		b.setWorkExperience("1998-2006", "YY��ҵ");

		Resume c = a.clone();
		c.setWorkExperience("1998-2003", "ZZ��ҵ");

		a.display();
		b.display();
		c.display();
	}
}