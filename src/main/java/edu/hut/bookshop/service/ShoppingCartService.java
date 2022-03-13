package edu.hut.bookshop.service;

import edu.hut.bookshop.pojo.ShoppingCart;

import java.util.List;

/**
 * @Description: 购物车模块业务接口
 * @Author: 贾扣扣
 * @Date: 2022/1/8 19:22
 */

public interface ShoppingCartService {

    int addToShoppingCart(ShoppingCart cart);

    int deleteShoppingCarts(int[] cartIds);

    int deleteShoppingCartByCartId(Integer cartId);

    int updateShoppingCart(ShoppingCart cart);

    List<ShoppingCart> getShoppingCartsByUserId(Integer userId);
}
