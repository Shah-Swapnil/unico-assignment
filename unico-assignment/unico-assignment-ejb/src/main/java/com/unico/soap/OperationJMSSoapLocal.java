/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unico.soap;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author S.Shah
 */
@Local
public interface OperationJMSSoapLocal {

    public int gcd() throws Exception;

    public List<Integer> gcdList() throws Exception;

    public int gcdSum() throws Exception;
}
