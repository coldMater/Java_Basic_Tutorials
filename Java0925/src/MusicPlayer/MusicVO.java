package MusicPlayer;

public class MusicVO {
	//����, ����, ����ð�, ���ϰ��
	private String title;
	private String singer;
	private int playTime;
	private String path;
	
	public MusicVO(String title, String singer, int playTime, String path) {
		super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public String getPath() {
		return path;
	}
	
}
