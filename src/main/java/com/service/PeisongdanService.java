package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeisongdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeisongdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeisongdanView;


/**
 * 配送单
 *
 * @author 
 * @email 
 * @date 2020-09-23 18:00:25
 */
public interface PeisongdanService extends IService<PeisongdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongdanVO> selectListVO(Wrapper<PeisongdanEntity> wrapper);
   	
   	PeisongdanVO selectVO(@Param("ew") Wrapper<PeisongdanEntity> wrapper);
   	
   	List<PeisongdanView> selectListView(Wrapper<PeisongdanEntity> wrapper);
   	
   	PeisongdanView selectView(@Param("ew") Wrapper<PeisongdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongdanEntity> wrapper);
   	
}

