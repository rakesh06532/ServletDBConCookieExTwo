package test;
import java.io.*;

@SuppressWarnings("serial")
public class BookBean implements Serializable {
	public BookBean() {}
	private String BCode,BName,BAuthor;
	private float BPrice;
	private int BQnty;
	public String getBCode() {
		return BCode;
	}
	public void setBCode(String bCode) {
		BCode = bCode;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public String getBAuthor() {
		return BAuthor;
	}
	public void setBAuthor(String bAuthor) {
		BAuthor = bAuthor;
	}
	public float getBPrice() {
		return BPrice;
	}
	public void setBPrice(float bPrice) {
		BPrice = bPrice;
	}
	public int getBQnty() {
		return BQnty;
	}
	public void setBQnty(int bQnty) {
		BQnty = bQnty;
	}

}
