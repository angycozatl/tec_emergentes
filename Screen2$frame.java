package appinventor.ai_angeles02blue.lobopark;

import com.google.appinventor.components.runtime.Component;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleMethod;
import gnu.mapping.CallContext;
import gnu.mapping.Symbol;
import gnu.mapping.Values;

public class Screen2$frame extends ModuleBody
{
  Screen2 $main;

  public Object apply0(ModuleMethod paramModuleMethod)
  {
    switch (paramModuleMethod.selector)
    {
    default:
      return super.apply0(paramModuleMethod);
    case 15:
      return Screen2.lambda2();
    case 16:
      this.$main.$define();
      return Values.empty;
    case 17:
      return Screen2.lambda3();
    case 18:
      return Screen2.lambda4();
    case 19:
      return Screen2.lambda5();
    case 20:
      return Screen2.lambda6();
    case 21:
      return Screen2.lambda7();
    case 22:
      return Screen2.lambda8();
    case 23:
      return this.$main.BotonMENU$Click();
    case 24:
      return Screen2.lambda9();
    case 25:
      return Screen2.lambda10();
    case 26:
      return Screen2.lambda11();
    case 27:
      return Screen2.lambda12();
    case 28:
      return Screen2.lambda13();
    case 29:
      return Screen2.lambda14();
    case 30:
      return Screen2.lambda15();
    case 31:
      return Screen2.lambda16();
    case 32:
      return this.$main.Botón1$Click();
    case 33:
      return Screen2.lambda17();
    case 34:
      return Screen2.lambda18();
    case 35:
    }
    return this.$main.Reloj1$Timer();
  }

  // ERROR //
  public Object apply1(ModuleMethod paramModuleMethod, Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 18	gnu/expr/ModuleMethod:selector	I
    //   4: tableswitch	default:+64 -> 68, 1:+71->75, 2:+64->68, 3:+83->87, 4:+64->68, 5:+103->107, 6:+64->68, 7:+64->68, 8:+64->68, 9:+64->68, 10:+131->135, 11:+143->147, 12:+155->159
    //   69: aload_1
    //   70: aload_2
    //   71: invokespecial 101	gnu/expr/ModuleBody:apply1	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;)Ljava/lang/Object;
    //   74: areturn
    //   75: aload_0
    //   76: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   79: aload_2
    //   80: invokevirtual 105	appinventor/ai_angeles02blue/lobopark/Screen2:androidLogForm	(Ljava/lang/Object;)V
    //   83: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   86: areturn
    //   87: aload_0
    //   88: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   91: astore 6
    //   93: aload_2
    //   94: checkcast 107	gnu/mapping/Symbol
    //   97: astore 8
    //   99: aload 6
    //   101: aload 8
    //   103: invokevirtual 111	appinventor/ai_angeles02blue/lobopark/Screen2:lookupInFormEnvironment	(Lgnu/mapping/Symbol;)Ljava/lang/Object;
    //   106: areturn
    //   107: aload_0
    //   108: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   111: astore_3
    //   112: aload_2
    //   113: checkcast 107	gnu/mapping/Symbol
    //   116: astore 5
    //   118: aload_3
    //   119: aload 5
    //   121: invokevirtual 115	appinventor/ai_angeles02blue/lobopark/Screen2:isBoundInFormEnvironment	(Lgnu/mapping/Symbol;)Z
    //   124: ifeq +7 -> 131
    //   127: getstatic 121	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   130: areturn
    //   131: getstatic 124	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   134: areturn
    //   135: aload_0
    //   136: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   139: aload_2
    //   140: invokevirtual 127	appinventor/ai_angeles02blue/lobopark/Screen2:addToFormDoAfterCreation	(Ljava/lang/Object;)V
    //   143: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   146: areturn
    //   147: aload_0
    //   148: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   151: aload_2
    //   152: invokevirtual 130	appinventor/ai_angeles02blue/lobopark/Screen2:sendError	(Ljava/lang/Object;)V
    //   155: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   158: areturn
    //   159: aload_0
    //   160: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   163: aload_2
    //   164: invokevirtual 133	appinventor/ai_angeles02blue/lobopark/Screen2:processException	(Ljava/lang/Object;)V
    //   167: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   170: areturn
    //   171: astore 7
    //   173: new 135	gnu/mapping/WrongType
    //   176: dup
    //   177: aload 7
    //   179: ldc 137
    //   181: iconst_1
    //   182: aload_2
    //   183: invokespecial 140	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   186: athrow
    //   187: astore 4
    //   189: new 135	gnu/mapping/WrongType
    //   192: dup
    //   193: aload 4
    //   195: ldc 142
    //   197: iconst_1
    //   198: aload_2
    //   199: invokespecial 140	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   202: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   93	99	171	java/lang/ClassCastException
    //   112	118	187	java/lang/ClassCastException
  }

  // ERROR //
  public Object apply2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 18	gnu/expr/ModuleMethod:selector	I
    //   4: tableswitch	default:+68 -> 72, 2:+76->80, 3:+100->104, 4:+68->72, 5:+68->72, 6:+121->125, 7:+145->149, 8:+68->72, 9:+158->162, 10:+68->72, 11:+68->72, 12:+68->72, 13:+68->72, 14:+171->175
    //   73: aload_1
    //   74: aload_2
    //   75: aload_3
    //   76: invokespecial 146	gnu/expr/ModuleBody:apply2	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   79: areturn
    //   80: aload_0
    //   81: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   84: astore 10
    //   86: aload_2
    //   87: checkcast 107	gnu/mapping/Symbol
    //   90: astore 12
    //   92: aload 10
    //   94: aload 12
    //   96: aload_3
    //   97: invokevirtual 150	appinventor/ai_angeles02blue/lobopark/Screen2:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   100: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   103: areturn
    //   104: aload_0
    //   105: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   108: astore 7
    //   110: aload_2
    //   111: checkcast 107	gnu/mapping/Symbol
    //   114: astore 9
    //   116: aload 7
    //   118: aload 9
    //   120: aload_3
    //   121: invokevirtual 153	appinventor/ai_angeles02blue/lobopark/Screen2:lookupInFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   124: areturn
    //   125: aload_0
    //   126: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   129: astore 4
    //   131: aload_2
    //   132: checkcast 107	gnu/mapping/Symbol
    //   135: astore 6
    //   137: aload 4
    //   139: aload 6
    //   141: aload_3
    //   142: invokevirtual 156	appinventor/ai_angeles02blue/lobopark/Screen2:addToGlobalVarEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   145: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   148: areturn
    //   149: aload_0
    //   150: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   153: aload_2
    //   154: aload_3
    //   155: invokevirtual 160	appinventor/ai_angeles02blue/lobopark/Screen2:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   158: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   161: areturn
    //   162: aload_0
    //   163: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   166: aload_2
    //   167: aload_3
    //   168: invokevirtual 163	appinventor/ai_angeles02blue/lobopark/Screen2:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   171: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   174: areturn
    //   175: aload_0
    //   176: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   179: aload_2
    //   180: aload_3
    //   181: invokevirtual 167	appinventor/ai_angeles02blue/lobopark/Screen2:lookupHandler	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   184: areturn
    //   185: astore 11
    //   187: new 135	gnu/mapping/WrongType
    //   190: dup
    //   191: aload 11
    //   193: ldc 169
    //   195: iconst_1
    //   196: aload_2
    //   197: invokespecial 140	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   200: athrow
    //   201: astore 8
    //   203: new 135	gnu/mapping/WrongType
    //   206: dup
    //   207: aload 8
    //   209: ldc 137
    //   211: iconst_1
    //   212: aload_2
    //   213: invokespecial 140	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   216: athrow
    //   217: astore 5
    //   219: new 135	gnu/mapping/WrongType
    //   222: dup
    //   223: aload 5
    //   225: ldc 171
    //   227: iconst_1
    //   228: aload_2
    //   229: invokespecial 140	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   232: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   86	92	185	java/lang/ClassCastException
    //   110	116	201	java/lang/ClassCastException
    //   131	137	217	java/lang/ClassCastException
  }

  // ERROR //
  public Object apply4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 18	gnu/expr/ModuleMethod:selector	I
    //   4: lookupswitch	default:+28->32, 8:+40->44, 13:+57->61
    //   33: aload_1
    //   34: aload_2
    //   35: aload_3
    //   36: aload 4
    //   38: aload 5
    //   40: invokespecial 175	gnu/expr/ModuleBody:apply4	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   43: areturn
    //   44: aload_0
    //   45: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   48: aload_2
    //   49: aload_3
    //   50: aload 4
    //   52: aload 5
    //   54: invokevirtual 179	appinventor/ai_angeles02blue/lobopark/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   57: getstatic 37	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   60: areturn
    //   61: aload_0
    //   62: getfield 28	appinventor/ai_angeles02blue/lobopark/Screen2$frame:$main	Lappinventor/ai_angeles02blue/lobopark/Screen2;
    //   65: astore 6
    //   67: aload_2
    //   68: checkcast 181	com/google/appinventor/components/runtime/Component
    //   71: astore 8
    //   73: aload_3
    //   74: checkcast 183	java/lang/String
    //   77: astore 10
    //   79: aload 4
    //   81: checkcast 183	java/lang/String
    //   84: astore 12
    //   86: aload 5
    //   88: checkcast 185	[Ljava/lang/Object;
    //   91: astore 14
    //   93: aload 6
    //   95: aload 8
    //   97: aload 10
    //   99: aload 12
    //   101: aload 14
    //   103: invokevirtual 189	appinventor/ai_angeles02blue/lobopark/Screen2:dispatchEvent	(Lcom/google/appinventor/components/runtime/Component;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Z
    //   106: ifeq +7 -> 113
    //   109: getstatic 121	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   112: areturn
    //   113: getstatic 124	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   116: areturn
    //   117: astore 7
    //   119: new 135	gnu/mapping/WrongType
    //   122: dup
    //   123: aload 7
    //   125: ldc 190
    //   127: iconst_1
    //   128: aload_2
    //   129: invokespecial 140	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   132: athrow
    //   133: astore 9
    //   135: new 135	gnu/mapping/WrongType
    //   138: dup
    //   139: aload 9
    //   141: ldc 190
    //   143: iconst_2
    //   144: aload_3
    //   145: invokespecial 140	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   148: athrow
    //   149: astore 11
    //   151: new 135	gnu/mapping/WrongType
    //   154: dup
    //   155: aload 11
    //   157: ldc 190
    //   159: iconst_3
    //   160: aload 4
    //   162: invokespecial 140	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   165: athrow
    //   166: astore 13
    //   168: new 135	gnu/mapping/WrongType
    //   171: dup
    //   172: aload 13
    //   174: ldc 190
    //   176: iconst_4
    //   177: aload 5
    //   179: invokespecial 140	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   182: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   67	73	117	java/lang/ClassCastException
    //   73	79	133	java/lang/ClassCastException
    //   79	86	149	java/lang/ClassCastException
    //   86	93	166	java/lang/ClassCastException
  }

  public int match0(ModuleMethod paramModuleMethod, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    default:
      return super.match0(paramModuleMethod, paramCallContext);
    case 35:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 34:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 33:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 32:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 31:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 30:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 29:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 28:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 27:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 26:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 25:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 24:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 23:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 22:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 21:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 20:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 19:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 18:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 17:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 16:
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 15:
    }
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 0;
    return 0;
  }

  public int match1(ModuleMethod paramModuleMethod, Object paramObject, CallContext paramCallContext)
  {
    int i = -786431;
    switch (paramModuleMethod.selector)
    {
    case 2:
    case 4:
    case 6:
    case 7:
    case 8:
    case 9:
    default:
      i = super.match1(paramModuleMethod, paramObject, paramCallContext);
    case 12:
    case 11:
    case 10:
    case 5:
    case 3:
      do
      {
        do
        {
          do
            return i;
          while (!(paramObject instanceof Screen2));
          paramCallContext.value1 = paramObject;
          paramCallContext.proc = paramModuleMethod;
          paramCallContext.pc = 1;
          return 0;
          paramCallContext.value1 = paramObject;
          paramCallContext.proc = paramModuleMethod;
          paramCallContext.pc = 1;
          return 0;
          paramCallContext.value1 = paramObject;
          paramCallContext.proc = paramModuleMethod;
          paramCallContext.pc = 1;
          return 0;
        }
        while (!(paramObject instanceof Symbol));
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      }
      while (!(paramObject instanceof Symbol));
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 1:
    }
    paramCallContext.value1 = paramObject;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 1;
    return 0;
  }

  public int match2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    case 4:
    case 5:
    case 8:
    case 10:
    case 11:
    case 12:
    case 13:
    default:
      return super.match2(paramModuleMethod, paramObject1, paramObject2, paramCallContext);
    case 14:
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 9:
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 7:
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 6:
      if (!(paramObject1 instanceof Symbol))
        return -786431;
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 3:
      if (!(paramObject1 instanceof Symbol))
        return -786431;
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 2:
    }
    if (!(paramObject1 instanceof Symbol))
      return -786431;
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 2;
    return 0;
  }

  public int match4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    default:
      return super.match4(paramModuleMethod, paramObject1, paramObject2, paramObject3, paramObject4, paramCallContext);
    case 13:
      if (!(paramObject1 instanceof Screen2))
        return -786431;
      paramCallContext.value1 = paramObject1;
      if (!(paramObject2 instanceof Component))
        return -786430;
      paramCallContext.value2 = paramObject2;
      if (!(paramObject3 instanceof String))
        return -786429;
      paramCallContext.value3 = paramObject3;
      if (!(paramObject4 instanceof String))
        return -786428;
      paramCallContext.value4 = paramObject4;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 4;
      return 0;
    case 8:
    }
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.value3 = paramObject3;
    paramCallContext.value4 = paramObject4;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 4;
    return 0;
  }
}

/* Location:           C:\Users\ANGELES\Desktop\BUAP\6_Primavera_2018\TEC_EMERGENTES\APP_FUNCIONAL\lobopark_dex2jar.jar
 * Qualified Name:     appinventor.ai_angeles02blue.lobopark.Screen2.frame
 * JD-Core Version:    0.6.2
 */