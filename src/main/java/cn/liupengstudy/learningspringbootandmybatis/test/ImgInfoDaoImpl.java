/*
package cn.liupengstudy.learningspringbootandmybatis.test;

import java.awt.image.ImageConsumer;
import java.sql.ResultSet;

*/
/**
 * author：李明秀
 * date: 2019年8月26日 14点06分
 * contact:
 *//*

public class ImgInfoDaoImpl implements ImgInfoDao {
    */
/**
     * 找到图片
     * @param id
     * @param type
     * @return
     *//*

    @Override
    public String findImg(int id, int type) {
        String imgURL = "null";
        try{
            String sql = "select imgUrl from image where imageId =? and imgType =?";

            Object[] params = new Object[2];
            params[0] = id;
            params[1] = type;

            ResultSet rs = executeSelect(sql,params);

            while(rs.next()){
                imgURL = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return imgURL;
    }

    */
/**
     * 添加图片
     * @param img
     * @return
     *//*

    @Override
    public int addImg(image img) {
        String sql = "insert into image(imageId, imgType, imgUrl, imgToId) value (?, ?, ?, ?)";

        Object[] params = new Object[4];
        params[0] = img.getImgId();
        params[1] = img.getImgType();
        params[2] = img.getImgUrl();
        params[3] = img.getImgTold();

        int i = executeIUD(sql,params);
        return i;
    }

    */
/**
     * 删除图片
     * @param id
     * @return
     *//*

    @Override
    public int deleteImg(int id) {
        String sql = "DELETE FROM image where imageId =?";

        Object[] params = new Object[1];
        params[0] = id;

        int i = executeIUD(sql,params);
        return i;
    }
}
*/
