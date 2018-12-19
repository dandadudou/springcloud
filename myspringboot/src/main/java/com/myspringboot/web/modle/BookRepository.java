package com.myspringboot.web.modle;

import com.myspringboot.web.entity.Book;

/**
 * @Auther: linzhixuan
 * @Date: 2018/12/11 10:09
 * @Description:
 */
public interface BookRepository {

    Book getByIsbn(String isbn);

}
