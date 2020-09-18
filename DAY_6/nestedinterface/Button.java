package nestedinterface;

public class Button {
	OnClickListener listener;
	
	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	interface OnClickListener{
		void onClick();
	}
	class OnClickListener2{
		void onClick2() {};
	}
}
