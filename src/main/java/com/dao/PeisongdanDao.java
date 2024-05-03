package com.dao;

import com.entity.PeisongdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeisongdanVO;
import com.entity.view.PeisongdanView;


/**
 * 配送单
 * 
 * @author 
 * @email 
 * @date 2020-09-23 18:00:25
 */
public interface PeisongdanDao extends BaseMapper<PeisongdanEntity> {
	
	List<PeisongdanVO> selectListVO(@Param("ew") Wrapper<PeisongdanEntity> wrapper);
	
	PeisongdanVO selectVO(@Param("ew") Wrapper<PeisongdanEntity> wrapper);
	
	List<PeisongdanView> selectListView(@Param("ew") Wrapper<PeisongdanEntity> wrapper);

	List<PeisongdanView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongdanEntity> wrapper);
	
	PeisongdanView selectView(@Param("ew") Wrapper<PeisongdanEntity> wrapper);
	
}
