package uz.najot.gardengame.service;

import uz.najot.gardengame.message.ResMessage;

public interface BasicService<T>{
    ResMessage getAll();
    ResMessage getById(Integer id);
    ResMessage create(T t);
    ResMessage edit(T t);
    ResMessage remove(Integer id);

}
