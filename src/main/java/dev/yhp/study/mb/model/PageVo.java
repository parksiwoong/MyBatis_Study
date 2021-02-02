package dev.yhp.study.mb.model;

import lombok.Data;

@Data
public class PageVo {
    private int num;    // 현재 페이지 번호
    private int count;    // 게시물 총 갯수
    private int postNum = 10;    // 한 페이지에 출력할 게시물 갯수
    private int pageNum;    // 하단 페이징 번호 ([ 게시물 총 갯수 ÷ 한 페이지에 출력할 갯수 ]의 올림)
    private int displayPost;    // 출력할 게시물
    private int pageNumCnt = 10;    // 한번에 표시할 페이징 번호의 갯수
    private int endPageNum;    // 표시되는 페이지 번호 중 마지막 번호
    private int startPageNum;    // 표시되는 페이지 번호 중 첫번째 번호
    private boolean prev;    // 다음/이전 표시 여부
    private boolean next;
    int endPageNum_tmp = (int) (Math.ceil((double) count / (double) pageNumCnt));    // 마지막 번호 재계산


    private void dataCalc() {
        endPageNum = (int) (Math.ceil((double) num / (double) pageNumCnt) * pageNumCnt);        // 마지막 번호
        startPageNum = endPageNum - (pageNumCnt - 1);                                           // 시작 번호
        int endPageNum_tmp = (int) (Math.ceil((double) count / (double) pageNumCnt));           // 마지막 번호 재계산
        if (endPageNum > endPageNum_tmp) {
            endPageNum = endPageNum_tmp;
        }
        prev = startPageNum == 1 ? false : true;
        next = endPageNum * pageNumCnt >= count ? false : true;
        displayPost = (num - 1) * postNum;
    }
}
