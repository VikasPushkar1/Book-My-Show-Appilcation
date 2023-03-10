package com.example.BookMyShowApplication.Services;



import com.example.BookMyShowApplication.Entities.UserEntity;
import com.example.BookMyShowApplication.EntryDtos.UserEntryDto;
import com.example.BookMyShowApplication.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntryDto userEntryDto){

        //Here we need to convert and save.
        /*
            Old method : create an object and set attributes.
         */
//
//        userEntity.setAge(userEntryDto.getAge())
//                userEntity.setAddress()

        //creating the objects
        UserEntity userEntity = UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName())
                .address(userEntryDto.getAddress()).email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo())
                .build();


        userRepository.save(userEntity);
        //This is to set all the attributes in 1 go.
    }



}