/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zalna.model;

import java.util.List;

/**
 *
 * @author DELL
 */
public interface AnggotaDao {
    //Anggota save(Anggota anggota);
    Anggota save(Anggota anggota);
    Anggota update(int index, Anggota anggota);
    void delete(int index);
    Anggota getAnggota(int index);
    List<Anggota> getAllAnggota();
}
