package a11_상속2;

public class CompanyTest {

	public static void main(String[] args) {
		ElectronicsCompany samsung = new ElectronicsCompany("삼성");
		ElectronicsCompany lg = new ElectronicsCompany("LG");
		DeliveryCompany baemin = new DeliveryCompany("배달의민족");
		DeliveryCompany yogiyo = new DeliveryCompany("요기요");
		
		samsung.setCompanyName("삼숭");
		
		Company samsung_company = samsung;
		Company lg_company = lg;
		Company baemin_company = baemin;
		Company yogiyo_company = yogiyo;
		
		samsung_company.setCompanyName("삼성");
		
//		samsung.setCompanyName("삼성전자");
//		lg.setCompanyName("LG");
//		baemin.setCompanyName("배달의민족");
//		yogiyo.setCompanyName("요기요");
		
		samsung.showCompanyInfo();
		lg.showCompanyInfo();
		baemin.showCompanyInfo();
		yogiyo.showCompanyInfo();
		
		samsung.addFactory();
		lg.addFactory();
		baemin.addMotocycle();
		yogiyo.addMotocycle();

		samsung_company.showCompanyInfo();
		
		
		ElectronicsCompany down_samsung_company = (ElectronicsCompany)samsung_company;
		down_samsung_company.addFactory();
		
//		Company c = new Company();
//		ElectronicsCompany ec = (ElectonicsCompany)c;
//		ec.addFactory();
//		DeliveryCompany dc = (DeliveryCompany)c;
//		dc.addMotocycle(); //이렇게는 안된다.
		
	}

}
