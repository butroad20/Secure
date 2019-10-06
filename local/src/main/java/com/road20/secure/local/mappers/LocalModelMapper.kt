package com.road20.secure.local.mappers

interface LocalModelMapper <LOCAL, REPOSITORY> {

    fun mapToLocal(repository: REPOSITORY): LOCAL

    fun mapToRepository(local: LOCAL): REPOSITORY

    fun mapToLocalList(repositoryList: List<REPOSITORY>) = repositoryList.map { mapToLocal(it) }

    fun mapToRepositoryList(localList: List<LOCAL>) = localList.map { mapToRepository(it) }
}