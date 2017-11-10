package cn.fjlcx.android.imitatejianshu.bean;

/**
 * EventBus通用类
 *
 * @author ling_cx
 * @date 2017/11/02.
 */

public class MessageEvent {
	public enum Code {
		LoginFinish,
		HandleCompleted,
		ShowUnReadAnnounceCompleted,
		UndoCount
	}

	private Code code;
	private String message;

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public MessageEvent(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageEvent(Code code, String message) {
		this.code = code;
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageEvent{" +
				"code=" + code +
				", message='" + message + '\'' +
				'}';
	}
}
