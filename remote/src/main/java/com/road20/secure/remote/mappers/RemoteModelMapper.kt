package com.road20.secure.remote.mappers

interface RemoteModelMapper <in REMOTE, out REPOSITORY> {

    fun mapToRepository(remote: REMOTE): REPOSITORY

    fun mapToRepositoryList(remoteList: List<REMOTE>) = remoteList.map { mapToRepository(it) }

    fun <T> safeList(value: List<T>?) = value ?: emptyList()

    fun safeString(value: String?) = value ?: "N/A"

    fun safeInt(value: Int?) = value ?: 0

    fun safeBoolean(value: Boolean?) = value ?: false

    fun safeLong(value: Long?) = value ?: 0L
}