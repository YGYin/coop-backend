package com.ygyin.coop.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ygyin.coop.model.dto.area.analyze.*;
import com.ygyin.coop.model.entity.Area;
import com.ygyin.coop.model.entity.Image;
import com.ygyin.coop.model.entity.User;
import com.ygyin.coop.model.vo.area.analyze.*;

import java.util.List;


/**
 * @author yg
 */
public interface AreaAnalyzeService extends IService<Area> {

    /**
     * 根据分析空间的范围，来检查用户是否有权限
     *
     * @param areaAnalyzeRequest
     * @param loginUser
     */
    void checkAreaAnalyzeAuth(AreaAnalyzeRequest areaAnalyzeRequest, User loginUser);

    /**
     * 根据分析请求的分析范围，封装查询条件
     *
     * @param areaAnalyzeRequest
     * @param queryWrapper
     */
    void setAnalyzeQueryWrapper(AreaAnalyzeRequest areaAnalyzeRequest, QueryWrapper<Image> queryWrapper);

    /**
     * 获取空间的储存用量分析数据
     *
     * @param usageAnalyzeRequest 空间储存用量分析请求
     * @param loginUser           登录用户
     * @return
     */
    AreaUsageAnalyzeResponse getAreaUsageAnalyze(AreaUsageAnalyzeRequest usageAnalyzeRequest, User loginUser);

    /**
     * 获取空间的图片分类分析数据
     *
     * @param categoryAnalyzeRequest
     * @param loginUser
     * @return
     */
    List<AreaCategoryAnalyzeResponse> getAreaCategoryAnalyze(AreaCategoryAnalyzeRequest categoryAnalyzeRequest, User loginUser);


    /**
     * 获取空间的图片 tag 分析数据
     *
     * @param tagAnalyzeRequest
     * @param loginUser
     * @return
     */
    List<AreaTagAnalyzeResponse> getAreaTagAnalyze(AreaTagAnalyzeRequest tagAnalyzeRequest, User loginUser);

    /**
     * 获取空间图片文件大小分析数据
     *
     * @param sizeAnalyzeRequest
     * @param loginUser
     * @return
     */
    List<AreaSizeAnalyzeResponse> getAreaSizeAnalyze(AreaSizeAnalyzeRequest sizeAnalyzeRequest, User loginUser);

    /**
     * 获取空间用户上传行为分析数据
     *
     * @param userAnalyzeRequest
     * @param loginUser
     * @return
     */
    List<AreaUserAnalyzeResponse> getAreaUserAnalyze(AreaUserAnalyzeRequest userAnalyzeRequest, User loginUser);

    /**
     * 获取空间按使用量排行分析数据 (管理员)
     *
     * @param rankingAnalyzeRequest
     * @param loginUser
     * @return
     */
    List<Area> getAreaRankingAnalyze(AreaRankingAnalyzeRequest rankingAnalyzeRequest, User loginUser);
}