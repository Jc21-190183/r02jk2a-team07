
public class Kadai01 {

	/**
	 * �ۑ�01
	 * ������̍��E�̕����𔽓]���ĕԂ����\�b�h
	 * @param s�@�Ώۂ̕���
	 * @return ���E�𔽓]��������
	 */
	String ReverseString(String s) {
		//TODO �v���O�����������ɍ쐬����
		if(s==null) {
		return s;
		}
		String r = "";
		for(int i = 0;s.length()>i;i++){
			r = r + s.charAt(s.length()-i-1);

		}

		return r;
	}
}
