package bao.dev;

public class Sinhvien_diemtrungbinh {
	private String name;
	private double toan;
	private double ly;
	private double hoa;
	
	public Sinhvien_diemtrungbinh(String name, double toan, double ly, double hoa) {
			
		this.name = name;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
			}
  public double diemtrungbinhB(double toan, double ly, double hoa) {
 	 return (toan + ly + hoa) / 3;
		}
  public void diemtrungbinh() {
	  System.out.println(name+":"+diemtrungbinhB(toan, ly, hoa));
	}
}