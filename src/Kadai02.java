
public class Kadai02 {

	/**
	 * �ۑ�02
	 * ������̒��ɁA�w�肳�ꂽ�A���t�@�x�b�g�������������Ă��邩��Ԃ����\�b�h
	 * @param s ������
	 * @param c ����
	 * @return s�̒��ɓ����Ă���c�̕�����
	 */
	int countString(String s,char c) {

		if(s == null) {
		return 0;
		}
		int count = 0;
	for(int i = 0;s.length()>i;i++) {
		if(s.charAt(s.length()-i-1)==c) {
			count++;
		}
	}
		return count;
	}
}
