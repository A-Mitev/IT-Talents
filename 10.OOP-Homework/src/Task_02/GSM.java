package Task_02;
public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	double price;
	

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber != null) {
			if ((simMobileNumber.length() == 10) && (simMobileNumber.substring(0, 2).equals("08"))) {
				this.simMobileNumber = simMobileNumber;
				this.hasSimCard = true;
			}
		}
	}

	void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = "";
	}

	void call(GSM receiver, int duration) {
		if ((receiver != null) && (receiver.hasSimCard)) {
			if (duration > 0 && duration <= 60) {
				if (this.hasSimCard && !this.simMobileNumber.equals(receiver.simMobileNumber)) {
					if (this != receiver) {
						Call newCall = new Call(price);
						newCall.caller = this;
						newCall.receiver = receiver;
						newCall.duration = duration;

						this.lastOutgoingCall = newCall;
						receiver.lastIncomingCall = newCall;
						this.outgoingCallDuration += duration;
					}
				}
			}
		}
	}

	double getSumForCall() {
		if (lastOutgoingCall == null) {
			return 0.0;
		}
		return this.outgoingCallDuration * this.lastOutgoingCall.priceForAMinute;
	}

	void printInfoForCall(Call call) {
		if (call != null) {
			System.out.println(call.caller.simMobileNumber 
					+ " se obazda na " 
					+ call.receiver.simMobileNumber
					+ " za tolkova vreme  " + call.duration);
		}
	}

	void printInfoForLastIncomingCall() {
		printInfoForCall(lastIncomingCall);
	}

	void printInfoForLastOutgoingCall() {
		printInfoForCall(lastOutgoingCall);
	}
}
