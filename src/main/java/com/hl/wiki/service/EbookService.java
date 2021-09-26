package com.hl.wiki.service;

import com.hl.wiki.domain.Ebook;
import com.hl.wiki.domain.EbookExample;
import com.hl.wiki.mapper.EbookMapper;
import com.hl.wiki.req.EbookReq;
import com.hl.wiki.resp.EbookResp;
import com.hl.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> EbookList = ebookMapper.selectByExample(ebookExample);
//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : EbookList) {
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
              //对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }
        //列表复制
        List<EbookResp> respList = CopyUtil.copyList(EbookList, EbookResp.class);
        return respList;
    }
}
