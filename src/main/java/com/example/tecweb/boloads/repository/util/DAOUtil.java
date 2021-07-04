package com.example.tecweb.boloads.repository.util;

public class DAOUtil
	{

	private DAOUtil( ) {
			throw new UnsupportedOperationException( "Classe di util" );
	}

	public static String getLikeParameter ( String param ){
			StringBuilder builder = new StringBuilder("%");
			builder
					.append( param )
					.append( "%" );
			return builder.toString();
		}
	}
