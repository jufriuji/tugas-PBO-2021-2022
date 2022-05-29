class ayam {
	private static String Jenis_unggas = "Ayam";
	private static int Jumlah_Kaki =2;
	
	public static String getJenisUnggas(){
		return Jenis_unggas;
	}
	
	public static int getJumlahKaki(){
		return Jumlah_Kaki;
	}
	
	private static void berkokok(){
		System.out.println("aku berkokok");
	}
	
	private static void berlari(){
		System.out.println("aku berlari");
	}
	
	public static void main(String[]args){
		System.out.println(String.format("jenis unggas: %s",getJenisUnggas()));
		System.out.println(String.format("jumlah kaki: %s",getJumlahKaki()));
		berkokok();
		berlari();
	}
}
