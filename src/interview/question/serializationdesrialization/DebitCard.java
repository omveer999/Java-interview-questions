package interview.question.serializationdesrialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * order of member field in writeExternal and readExternal method should be same
 */
class DebitCard implements Externalizable{

	int id;
	String type;
	String cardNumber;
	String cardHolderName;
	int  cvv;
	String pincode;
	
	
	
	
	
	
	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DebitCard(int id, String type, String cardNumber, String cardHolderName, int cvv, String pincode) {
		super();
		this.id = id;
		this.type = type;
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "DebitCard [id=" + id + ", type=" + type + ", cardNumber=" + cardNumber + ", cardHolderName="
				+ cardHolderName + ", cvv=" + cvv + ", pincode=" + pincode + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeUTF(cardHolderName);
		out.writeUTF(type);
		out.writeUTF(cardNumber);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=in.readInt();
		cardHolderName=in.readUTF();
		type=in.readUTF();
		cardNumber=in.readUTF();
		
	}

}
