package editor.service;


/**
 * Copyright 2021 Blockly Service @ https://github.com/orion-services/blockly
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import editor.model.User;
import editor.repository.*;

public class BaseService {

    @Inject
    protected UserRepository userRepository;
    @Inject
    protected CodeRepository codeRepository;
    @Inject
    protected GroupRepository groupRepository;
    @Inject
    protected StatusRepository statusRepository;
    @Inject
    protected ActivityRepository activityRepository;
    @Inject
    protected UserJPARepository userJPARepository;
    protected static final String URL_BLOCKLY = "http://150.230.76.241:7000/?hash=";
    protected static final String QUERY_HASH_USER = "hashUser";
    protected static final String QUERY_HASH_CODE = "hashCode";
    protected static final String QUERY_NAME = "name";
    protected static final String QUERY_GROUP_ID = "ugroup_id";
    protected static final String QUERY_USER_ID = "user_id";
    protected static final String EMPTY_DATA = "Empty data, make sure you fill in correctly and try again";
    protected static final String USER_ALREADY = "User already registered";
    protected static final String GROUP_ALREADY = "Group already registered";
    protected static final String USER_NOT_EXIST = "User not exist";
    protected static final String GROUP_NOT_EXIST = "Group not exist";
    protected static final String ACTIVITY_NOT_EXIST = "Activity not exist";
    protected static final String CODE_NOT_FOUND = "Code not found";
    protected static final Integer LIMIT_BLOCK = 50;


}
