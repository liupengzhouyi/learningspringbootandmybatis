/*
package cn.liupengstudy.learningspringbootandmybatis.test;

public class ImgInfoDaoImplTest {

    private ImgInfoDao imgInfoDao;

    public ImgInfoDaoImplTest() {
        this.imgInfoDao = new ImgInfoDaoImpl();
    }

    public ImgInfoDao getImgInfoDao() {
        return imgInfoDao;
    }

    public void setImgInfoDao(ImgInfoDao imgInfoDao) {
        this.imgInfoDao = imgInfoDao;
    }

    public void testFindImg(int id, int type) {
        System.out.println("start test find img");

        System.out.println("img url:" + this.getImgInfoDao().findImg(id, type));

        System.out.println("end test find img");
    }

    public void testAddImg() {
        image testImage = new image();
        testImage.setImgId(999);
        testImage.setImgType(1);
        testImage.setImgUrl("testurl");
        testImage.setImgTold(999);

        System.out.println("start test add img");

        System.out.println("  start add img...");
        int i = this.getImgInfoDao().addImg(testImage);
        System.out.println("  end add imag...");


        this.testFindImg(999, 1);

        System.out.println("end test add img");
    }

    public void testDelImg(int imgID) {

        System.out.println("start test delete img");

        this.getImgInfoDao().deleteImg(imgID);

        this.testFindImg(999, 1);

        System.out.println("end test delete img");
    }


    public static void main(String[] args) {

        ImgInfoDaoImplTest imgInfoDaoImplTest = new ImgInfoDaoImplTest();

        imgInfoDaoImplTest.testAddImg();

        imgInfoDaoImplTest.testDelImg(999);

    }
}
*/
